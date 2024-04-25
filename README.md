# Kafka & Schema Registry

## Steps

1. Need to run the application.
2. Need to run docker compose.
3. http://localhost:9021 is the Control Center


## Kafka Information

https://jskim1991.medium.com/docker-docker-compose-example-for-kafka-zookeeper-and-schema-registry-c516422532e7

https://github.com/confluentinc/schema-registry

https://www.baeldung.com/java-apache-avro

https://www.youtube.com/watch?v=u0kRK-qbopk

## Issues

Schema:

```

{
  "namespace": "com.mdymen.kafkaschemaregistry",
  "type": "record",
  "name": "UserTest",
  "fields": [
    {
      "name": "name",
      "type": "string",
      "avro.java.string": "String"
    },
    {
      "name": "age",
      "type": "int"
    }
  ]
}

```

### Backward 

If i update the schema to:

```

{
  "namespace": "com.mdymen.kafkaschemaregistry",
  "type": "record",
  "name": "UserTest",
  "fields": [
    {
      "name": "name",
      "type": "string",
      "avro.java.string": "String"
    },
    {
      "name": "age",
      "type": "int"
    },
    {
      "name": "surname",
      "type": "string",
      "avro.java.string": "String"
    }
  ]
}

```

Backward compatibility (default): A new schema is backward compatible if it can be used to read the data written in all previous schemas. Backward compatibility is useful for loading data into systems like Hadoop since one can always query data of all versions using the latest schema.

Thats why in the previous schema, the application will throw:

```
Schema being registered is incompatible with an earlier schema; error code: 409
```

In order to work properly, the **surname** field needs to have a default value, and the result when a consumer gets the message will be:

```
2024-04-24T23:12:20.664-03:00  INFO 520322 --- [kafka-schema-registry] [ntainer#0-0-C-1] c.mdymen.kafkaschemaregistry.Consumer    : Reading message ConsumerRecord(topic = normal-topic, partition = 1, leaderEpoch = 0, offset = 0, CreateTime = 1714011114349, serialized key size = 36, serialized value size = 24, headers = RecordHeaders(headers = [], isReadOnly = false), key = 4e036664-3ca9-4a8a-ab80-733cf41a27bd, value = {"name": "Martin", "age": 38, "surname": "Dymenstein"}) from topic normal-topic.

```

Default values in Avro schemas specify what to use when encountering a missing field during data reading. Here's how they contribute to backward compatibility:

1. **Reader Schema with Default:** If the reader schema has a field with a default value (including an empty string), it can use that default value for data written by a writer schema lacking that field. This prevents errors and ensures successful data processing.

2. **Reader Schema Without Default:** When the reader schema doesn't have a default value for a missing field in the writer schema, Avro may throw a 409 exception (Conflict). This indicates a schema incompatibility that could lead to unexpected data interpretation.



### Forward


