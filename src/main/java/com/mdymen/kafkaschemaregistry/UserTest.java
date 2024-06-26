/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.mdymen.kafkaschemaregistry;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class UserTest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1334082518072297328L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserTest\",\"namespace\":\"com.mdymen.kafkaschemaregistry\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"surname\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\",\"avro.java.string\":\"String\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UserTest> ENCODER =
      new BinaryMessageEncoder<UserTest>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UserTest> DECODER =
      new BinaryMessageDecoder<UserTest>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<UserTest> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<UserTest> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<UserTest>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this UserTest to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a UserTest from a ByteBuffer. */
  public static UserTest fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String name;
  @Deprecated public int age;
  @Deprecated public java.lang.String surname;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserTest() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param age The new value for age
   * @param surname The new value for surname
   */
  public UserTest(java.lang.String name, java.lang.Integer age, java.lang.String surname) {
    this.name = name;
    this.age = age;
    this.surname = surname;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return age;
    case 2: return surname;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: age = (java.lang.Integer)value$; break;
    case 2: surname = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'surname' field.
   * @return The value of the 'surname' field.
   */
  public java.lang.String getSurname() {
    return surname;
  }

  /**
   * Sets the value of the 'surname' field.
   * @param value the value to set.
   */
  public void setSurname(java.lang.String value) {
    this.surname = value;
  }

  /**
   * Creates a new UserTest RecordBuilder.
   * @return A new UserTest RecordBuilder
   */
  public static com.mdymen.kafkaschemaregistry.UserTest.Builder newBuilder() {
    return new com.mdymen.kafkaschemaregistry.UserTest.Builder();
  }

  /**
   * Creates a new UserTest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserTest RecordBuilder
   */
  public static com.mdymen.kafkaschemaregistry.UserTest.Builder newBuilder(com.mdymen.kafkaschemaregistry.UserTest.Builder other) {
    return new com.mdymen.kafkaschemaregistry.UserTest.Builder(other);
  }

  /**
   * Creates a new UserTest RecordBuilder by copying an existing UserTest instance.
   * @param other The existing instance to copy.
   * @return A new UserTest RecordBuilder
   */
  public static com.mdymen.kafkaschemaregistry.UserTest.Builder newBuilder(com.mdymen.kafkaschemaregistry.UserTest other) {
    return new com.mdymen.kafkaschemaregistry.UserTest.Builder(other);
  }

  /**
   * RecordBuilder for UserTest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserTest>
    implements org.apache.avro.data.RecordBuilder<UserTest> {

    private java.lang.String name;
    private int age;
    private java.lang.String surname;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.mdymen.kafkaschemaregistry.UserTest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.surname)) {
        this.surname = data().deepCopy(fields()[2].schema(), other.surname);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing UserTest instance
     * @param other The existing instance to copy.
     */
    private Builder(com.mdymen.kafkaschemaregistry.UserTest other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.surname)) {
        this.surname = data().deepCopy(fields()[2].schema(), other.surname);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.mdymen.kafkaschemaregistry.UserTest.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.mdymen.kafkaschemaregistry.UserTest.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public com.mdymen.kafkaschemaregistry.UserTest.Builder setAge(int value) {
      validate(fields()[1], value);
      this.age = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public com.mdymen.kafkaschemaregistry.UserTest.Builder clearAge() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'surname' field.
      * @return The value.
      */
    public java.lang.String getSurname() {
      return surname;
    }

    /**
      * Sets the value of the 'surname' field.
      * @param value The value of 'surname'.
      * @return This builder.
      */
    public com.mdymen.kafkaschemaregistry.UserTest.Builder setSurname(java.lang.String value) {
      validate(fields()[2], value);
      this.surname = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'surname' field has been set.
      * @return True if the 'surname' field has been set, false otherwise.
      */
    public boolean hasSurname() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'surname' field.
      * @return This builder.
      */
    public com.mdymen.kafkaschemaregistry.UserTest.Builder clearSurname() {
      surname = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UserTest build() {
      try {
        UserTest record = new UserTest();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.age = fieldSetFlags()[1] ? this.age : (java.lang.Integer) defaultValue(fields()[1]);
        record.surname = fieldSetFlags()[2] ? this.surname : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UserTest>
    WRITER$ = (org.apache.avro.io.DatumWriter<UserTest>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UserTest>
    READER$ = (org.apache.avro.io.DatumReader<UserTest>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
