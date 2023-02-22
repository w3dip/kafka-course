/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.luxoft.eas026.streams;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Purchase extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1468645422403412619L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Purchase\",\"namespace\":\"com.luxoft.eas026.streams\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"product\",\"type\":\"string\"},{\"name\":\"amount\",\"type\":\"long\"},{\"name\":\"sum\",\"type\":\"float\"},{\"name\":\"customerId\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Purchase> ENCODER =
      new BinaryMessageEncoder<Purchase>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Purchase> DECODER =
      new BinaryMessageDecoder<Purchase>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Purchase> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Purchase> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Purchase> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Purchase>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Purchase to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Purchase from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Purchase instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Purchase fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long id;
  @Deprecated public java.lang.CharSequence product;
  @Deprecated public long amount;
  @Deprecated public float sum;
  @Deprecated public long customerId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Purchase() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param product The new value for product
   * @param amount The new value for amount
   * @param sum The new value for sum
   * @param customerId The new value for customerId
   */
  public Purchase(java.lang.Long id, java.lang.CharSequence product, java.lang.Long amount, java.lang.Float sum, java.lang.Long customerId) {
    this.id = id;
    this.product = product;
    this.amount = amount;
    this.sum = sum;
    this.customerId = customerId;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return product;
    case 2: return amount;
    case 3: return sum;
    case 4: return customerId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: product = (java.lang.CharSequence)value$; break;
    case 2: amount = (java.lang.Long)value$; break;
    case 3: sum = (java.lang.Float)value$; break;
    case 4: customerId = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'product' field.
   * @return The value of the 'product' field.
   */
  public java.lang.CharSequence getProduct() {
    return product;
  }


  /**
   * Sets the value of the 'product' field.
   * @param value the value to set.
   */
  public void setProduct(java.lang.CharSequence value) {
    this.product = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public long getAmount() {
    return amount;
  }


  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(long value) {
    this.amount = value;
  }

  /**
   * Gets the value of the 'sum' field.
   * @return The value of the 'sum' field.
   */
  public float getSum() {
    return sum;
  }


  /**
   * Sets the value of the 'sum' field.
   * @param value the value to set.
   */
  public void setSum(float value) {
    this.sum = value;
  }

  /**
   * Gets the value of the 'customerId' field.
   * @return The value of the 'customerId' field.
   */
  public long getCustomerId() {
    return customerId;
  }


  /**
   * Sets the value of the 'customerId' field.
   * @param value the value to set.
   */
  public void setCustomerId(long value) {
    this.customerId = value;
  }

  /**
   * Creates a new Purchase RecordBuilder.
   * @return A new Purchase RecordBuilder
   */
  public static com.luxoft.eas026.streams.Purchase.Builder newBuilder() {
    return new com.luxoft.eas026.streams.Purchase.Builder();
  }

  /**
   * Creates a new Purchase RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Purchase RecordBuilder
   */
  public static com.luxoft.eas026.streams.Purchase.Builder newBuilder(com.luxoft.eas026.streams.Purchase.Builder other) {
    if (other == null) {
      return new com.luxoft.eas026.streams.Purchase.Builder();
    } else {
      return new com.luxoft.eas026.streams.Purchase.Builder(other);
    }
  }

  /**
   * Creates a new Purchase RecordBuilder by copying an existing Purchase instance.
   * @param other The existing instance to copy.
   * @return A new Purchase RecordBuilder
   */
  public static com.luxoft.eas026.streams.Purchase.Builder newBuilder(com.luxoft.eas026.streams.Purchase other) {
    if (other == null) {
      return new com.luxoft.eas026.streams.Purchase.Builder();
    } else {
      return new com.luxoft.eas026.streams.Purchase.Builder(other);
    }
  }

  /**
   * RecordBuilder for Purchase instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Purchase>
    implements org.apache.avro.data.RecordBuilder<Purchase> {

    private long id;
    private java.lang.CharSequence product;
    private long amount;
    private float sum;
    private long customerId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.luxoft.eas026.streams.Purchase.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.product)) {
        this.product = data().deepCopy(fields()[1].schema(), other.product);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.amount)) {
        this.amount = data().deepCopy(fields()[2].schema(), other.amount);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.sum)) {
        this.sum = data().deepCopy(fields()[3].schema(), other.sum);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.customerId)) {
        this.customerId = data().deepCopy(fields()[4].schema(), other.customerId);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Purchase instance
     * @param other The existing instance to copy.
     */
    private Builder(com.luxoft.eas026.streams.Purchase other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.product)) {
        this.product = data().deepCopy(fields()[1].schema(), other.product);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.amount)) {
        this.amount = data().deepCopy(fields()[2].schema(), other.amount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.sum)) {
        this.sum = data().deepCopy(fields()[3].schema(), other.sum);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.customerId)) {
        this.customerId = data().deepCopy(fields()[4].schema(), other.customerId);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.luxoft.eas026.streams.Purchase.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.luxoft.eas026.streams.Purchase.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'product' field.
      * @return The value.
      */
    public java.lang.CharSequence getProduct() {
      return product;
    }


    /**
      * Sets the value of the 'product' field.
      * @param value The value of 'product'.
      * @return This builder.
      */
    public com.luxoft.eas026.streams.Purchase.Builder setProduct(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.product = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'product' field has been set.
      * @return True if the 'product' field has been set, false otherwise.
      */
    public boolean hasProduct() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'product' field.
      * @return This builder.
      */
    public com.luxoft.eas026.streams.Purchase.Builder clearProduct() {
      product = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public long getAmount() {
      return amount;
    }


    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public com.luxoft.eas026.streams.Purchase.Builder setAmount(long value) {
      validate(fields()[2], value);
      this.amount = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public com.luxoft.eas026.streams.Purchase.Builder clearAmount() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'sum' field.
      * @return The value.
      */
    public float getSum() {
      return sum;
    }


    /**
      * Sets the value of the 'sum' field.
      * @param value The value of 'sum'.
      * @return This builder.
      */
    public com.luxoft.eas026.streams.Purchase.Builder setSum(float value) {
      validate(fields()[3], value);
      this.sum = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'sum' field has been set.
      * @return True if the 'sum' field has been set, false otherwise.
      */
    public boolean hasSum() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'sum' field.
      * @return This builder.
      */
    public com.luxoft.eas026.streams.Purchase.Builder clearSum() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'customerId' field.
      * @return The value.
      */
    public long getCustomerId() {
      return customerId;
    }


    /**
      * Sets the value of the 'customerId' field.
      * @param value The value of 'customerId'.
      * @return This builder.
      */
    public com.luxoft.eas026.streams.Purchase.Builder setCustomerId(long value) {
      validate(fields()[4], value);
      this.customerId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'customerId' field has been set.
      * @return True if the 'customerId' field has been set, false otherwise.
      */
    public boolean hasCustomerId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'customerId' field.
      * @return This builder.
      */
    public com.luxoft.eas026.streams.Purchase.Builder clearCustomerId() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Purchase build() {
      try {
        Purchase record = new Purchase();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.product = fieldSetFlags()[1] ? this.product : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.amount = fieldSetFlags()[2] ? this.amount : (java.lang.Long) defaultValue(fields()[2]);
        record.sum = fieldSetFlags()[3] ? this.sum : (java.lang.Float) defaultValue(fields()[3]);
        record.customerId = fieldSetFlags()[4] ? this.customerId : (java.lang.Long) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Purchase>
    WRITER$ = (org.apache.avro.io.DatumWriter<Purchase>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Purchase>
    READER$ = (org.apache.avro.io.DatumReader<Purchase>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.id);

    out.writeString(this.product);

    out.writeLong(this.amount);

    out.writeFloat(this.sum);

    out.writeLong(this.customerId);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readLong();

      this.product = in.readString(this.product instanceof Utf8 ? (Utf8)this.product : null);

      this.amount = in.readLong();

      this.sum = in.readFloat();

      this.customerId = in.readLong();

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readLong();
          break;

        case 1:
          this.product = in.readString(this.product instanceof Utf8 ? (Utf8)this.product : null);
          break;

        case 2:
          this.amount = in.readLong();
          break;

        case 3:
          this.sum = in.readFloat();
          break;

        case 4:
          this.customerId = in.readLong();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










