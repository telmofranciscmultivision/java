/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package key.SOURCEDB.CAM00020.CAM20;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class LOGTXN_T extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8360612553965757228L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LOGTXN_T\",\"namespace\":\"key.SOURCEDB.CAM00020.CAM20\",\"fields\":[{\"name\":\"ACCT_COID\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"ACCT_PROD\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"ACCT_NBR\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"FILE_ORIG\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"PSTG_DT\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"PSTG_SEQ\",\"type\":\"string\",\"default\":\"\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<LOGTXN_T> ENCODER =
      new BinaryMessageEncoder<LOGTXN_T>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<LOGTXN_T> DECODER =
      new BinaryMessageDecoder<LOGTXN_T>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<LOGTXN_T> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<LOGTXN_T> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<LOGTXN_T> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<LOGTXN_T>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this LOGTXN_T to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a LOGTXN_T from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a LOGTXN_T instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static LOGTXN_T fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence ACCT_COID;
   private java.lang.CharSequence ACCT_PROD;
   private java.lang.CharSequence ACCT_NBR;
   private java.lang.CharSequence FILE_ORIG;
   private java.lang.CharSequence PSTG_DT;
   private java.lang.CharSequence PSTG_SEQ;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LOGTXN_T() {}

  /**
   * All-args constructor.
   * @param ACCT_COID The new value for ACCT_COID
   * @param ACCT_PROD The new value for ACCT_PROD
   * @param ACCT_NBR The new value for ACCT_NBR
   * @param FILE_ORIG The new value for FILE_ORIG
   * @param PSTG_DT The new value for PSTG_DT
   * @param PSTG_SEQ The new value for PSTG_SEQ
   */
  public LOGTXN_T(java.lang.CharSequence ACCT_COID, java.lang.CharSequence ACCT_PROD, java.lang.CharSequence ACCT_NBR, java.lang.CharSequence FILE_ORIG, java.lang.CharSequence PSTG_DT, java.lang.CharSequence PSTG_SEQ) {
    this.ACCT_COID = ACCT_COID;
    this.ACCT_PROD = ACCT_PROD;
    this.ACCT_NBR = ACCT_NBR;
    this.FILE_ORIG = FILE_ORIG;
    this.PSTG_DT = PSTG_DT;
    this.PSTG_SEQ = PSTG_SEQ;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ACCT_COID;
    case 1: return ACCT_PROD;
    case 2: return ACCT_NBR;
    case 3: return FILE_ORIG;
    case 4: return PSTG_DT;
    case 5: return PSTG_SEQ;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ACCT_COID = (java.lang.CharSequence)value$; break;
    case 1: ACCT_PROD = (java.lang.CharSequence)value$; break;
    case 2: ACCT_NBR = (java.lang.CharSequence)value$; break;
    case 3: FILE_ORIG = (java.lang.CharSequence)value$; break;
    case 4: PSTG_DT = (java.lang.CharSequence)value$; break;
    case 5: PSTG_SEQ = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'ACCT_COID' field.
   * @return The value of the 'ACCT_COID' field.
   */
  public java.lang.CharSequence getACCTCOID() {
    return ACCT_COID;
  }


  /**
   * Sets the value of the 'ACCT_COID' field.
   * @param value the value to set.
   */
  public void setACCTCOID(java.lang.CharSequence value) {
    this.ACCT_COID = value;
  }

  /**
   * Gets the value of the 'ACCT_PROD' field.
   * @return The value of the 'ACCT_PROD' field.
   */
  public java.lang.CharSequence getACCTPROD() {
    return ACCT_PROD;
  }


  /**
   * Sets the value of the 'ACCT_PROD' field.
   * @param value the value to set.
   */
  public void setACCTPROD(java.lang.CharSequence value) {
    this.ACCT_PROD = value;
  }

  /**
   * Gets the value of the 'ACCT_NBR' field.
   * @return The value of the 'ACCT_NBR' field.
   */
  public java.lang.CharSequence getACCTNBR() {
    return ACCT_NBR;
  }


  /**
   * Sets the value of the 'ACCT_NBR' field.
   * @param value the value to set.
   */
  public void setACCTNBR(java.lang.CharSequence value) {
    this.ACCT_NBR = value;
  }

  /**
   * Gets the value of the 'FILE_ORIG' field.
   * @return The value of the 'FILE_ORIG' field.
   */
  public java.lang.CharSequence getFILEORIG() {
    return FILE_ORIG;
  }


  /**
   * Sets the value of the 'FILE_ORIG' field.
   * @param value the value to set.
   */
  public void setFILEORIG(java.lang.CharSequence value) {
    this.FILE_ORIG = value;
  }

  /**
   * Gets the value of the 'PSTG_DT' field.
   * @return The value of the 'PSTG_DT' field.
   */
  public java.lang.CharSequence getPSTGDT() {
    return PSTG_DT;
  }


  /**
   * Sets the value of the 'PSTG_DT' field.
   * @param value the value to set.
   */
  public void setPSTGDT(java.lang.CharSequence value) {
    this.PSTG_DT = value;
  }

  /**
   * Gets the value of the 'PSTG_SEQ' field.
   * @return The value of the 'PSTG_SEQ' field.
   */
  public java.lang.CharSequence getPSTGSEQ() {
    return PSTG_SEQ;
  }


  /**
   * Sets the value of the 'PSTG_SEQ' field.
   * @param value the value to set.
   */
  public void setPSTGSEQ(java.lang.CharSequence value) {
    this.PSTG_SEQ = value;
  }

  /**
   * Creates a new LOGTXN_T RecordBuilder.
   * @return A new LOGTXN_T RecordBuilder
   */
  public static key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder newBuilder() {
    return new key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder();
  }

  /**
   * Creates a new LOGTXN_T RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LOGTXN_T RecordBuilder
   */
  public static key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder newBuilder(key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder other) {
    if (other == null) {
      return new key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder();
    } else {
      return new key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder(other);
    }
  }

  /**
   * Creates a new LOGTXN_T RecordBuilder by copying an existing LOGTXN_T instance.
   * @param other The existing instance to copy.
   * @return A new LOGTXN_T RecordBuilder
   */
  public static key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder newBuilder(key.SOURCEDB.CAM00020.CAM20.LOGTXN_T other) {
    if (other == null) {
      return new key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder();
    } else {
      return new key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder(other);
    }
  }

  /**
   * RecordBuilder for LOGTXN_T instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LOGTXN_T>
    implements org.apache.avro.data.RecordBuilder<LOGTXN_T> {

    private java.lang.CharSequence ACCT_COID;
    private java.lang.CharSequence ACCT_PROD;
    private java.lang.CharSequence ACCT_NBR;
    private java.lang.CharSequence FILE_ORIG;
    private java.lang.CharSequence PSTG_DT;
    private java.lang.CharSequence PSTG_SEQ;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ACCT_COID)) {
        this.ACCT_COID = data().deepCopy(fields()[0].schema(), other.ACCT_COID);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.ACCT_PROD)) {
        this.ACCT_PROD = data().deepCopy(fields()[1].schema(), other.ACCT_PROD);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.ACCT_NBR)) {
        this.ACCT_NBR = data().deepCopy(fields()[2].schema(), other.ACCT_NBR);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.FILE_ORIG)) {
        this.FILE_ORIG = data().deepCopy(fields()[3].schema(), other.FILE_ORIG);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.PSTG_DT)) {
        this.PSTG_DT = data().deepCopy(fields()[4].schema(), other.PSTG_DT);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.PSTG_SEQ)) {
        this.PSTG_SEQ = data().deepCopy(fields()[5].schema(), other.PSTG_SEQ);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing LOGTXN_T instance
     * @param other The existing instance to copy.
     */
    private Builder(key.SOURCEDB.CAM00020.CAM20.LOGTXN_T other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.ACCT_COID)) {
        this.ACCT_COID = data().deepCopy(fields()[0].schema(), other.ACCT_COID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ACCT_PROD)) {
        this.ACCT_PROD = data().deepCopy(fields()[1].schema(), other.ACCT_PROD);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ACCT_NBR)) {
        this.ACCT_NBR = data().deepCopy(fields()[2].schema(), other.ACCT_NBR);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.FILE_ORIG)) {
        this.FILE_ORIG = data().deepCopy(fields()[3].schema(), other.FILE_ORIG);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.PSTG_DT)) {
        this.PSTG_DT = data().deepCopy(fields()[4].schema(), other.PSTG_DT);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.PSTG_SEQ)) {
        this.PSTG_SEQ = data().deepCopy(fields()[5].schema(), other.PSTG_SEQ);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'ACCT_COID' field.
      * @return The value.
      */
    public java.lang.CharSequence getACCTCOID() {
      return ACCT_COID;
    }


    /**
      * Sets the value of the 'ACCT_COID' field.
      * @param value The value of 'ACCT_COID'.
      * @return This builder.
      */
    public key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder setACCTCOID(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ACCT_COID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ACCT_COID' field has been set.
      * @return True if the 'ACCT_COID' field has been set, false otherwise.
      */
    public boolean hasACCTCOID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ACCT_COID' field.
      * @return This builder.
      */
    public key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder clearACCTCOID() {
      ACCT_COID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ACCT_PROD' field.
      * @return The value.
      */
    public java.lang.CharSequence getACCTPROD() {
      return ACCT_PROD;
    }


    /**
      * Sets the value of the 'ACCT_PROD' field.
      * @param value The value of 'ACCT_PROD'.
      * @return This builder.
      */
    public key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder setACCTPROD(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.ACCT_PROD = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ACCT_PROD' field has been set.
      * @return True if the 'ACCT_PROD' field has been set, false otherwise.
      */
    public boolean hasACCTPROD() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ACCT_PROD' field.
      * @return This builder.
      */
    public key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder clearACCTPROD() {
      ACCT_PROD = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'ACCT_NBR' field.
      * @return The value.
      */
    public java.lang.CharSequence getACCTNBR() {
      return ACCT_NBR;
    }


    /**
      * Sets the value of the 'ACCT_NBR' field.
      * @param value The value of 'ACCT_NBR'.
      * @return This builder.
      */
    public key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder setACCTNBR(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.ACCT_NBR = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'ACCT_NBR' field has been set.
      * @return True if the 'ACCT_NBR' field has been set, false otherwise.
      */
    public boolean hasACCTNBR() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'ACCT_NBR' field.
      * @return This builder.
      */
    public key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder clearACCTNBR() {
      ACCT_NBR = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'FILE_ORIG' field.
      * @return The value.
      */
    public java.lang.CharSequence getFILEORIG() {
      return FILE_ORIG;
    }


    /**
      * Sets the value of the 'FILE_ORIG' field.
      * @param value The value of 'FILE_ORIG'.
      * @return This builder.
      */
    public key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder setFILEORIG(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.FILE_ORIG = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'FILE_ORIG' field has been set.
      * @return True if the 'FILE_ORIG' field has been set, false otherwise.
      */
    public boolean hasFILEORIG() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'FILE_ORIG' field.
      * @return This builder.
      */
    public key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder clearFILEORIG() {
      FILE_ORIG = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'PSTG_DT' field.
      * @return The value.
      */
    public java.lang.CharSequence getPSTGDT() {
      return PSTG_DT;
    }


    /**
      * Sets the value of the 'PSTG_DT' field.
      * @param value The value of 'PSTG_DT'.
      * @return This builder.
      */
    public key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder setPSTGDT(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.PSTG_DT = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'PSTG_DT' field has been set.
      * @return True if the 'PSTG_DT' field has been set, false otherwise.
      */
    public boolean hasPSTGDT() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'PSTG_DT' field.
      * @return This builder.
      */
    public key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder clearPSTGDT() {
      PSTG_DT = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'PSTG_SEQ' field.
      * @return The value.
      */
    public java.lang.CharSequence getPSTGSEQ() {
      return PSTG_SEQ;
    }


    /**
      * Sets the value of the 'PSTG_SEQ' field.
      * @param value The value of 'PSTG_SEQ'.
      * @return This builder.
      */
    public key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder setPSTGSEQ(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.PSTG_SEQ = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'PSTG_SEQ' field has been set.
      * @return True if the 'PSTG_SEQ' field has been set, false otherwise.
      */
    public boolean hasPSTGSEQ() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'PSTG_SEQ' field.
      * @return This builder.
      */
    public key.SOURCEDB.CAM00020.CAM20.LOGTXN_T.Builder clearPSTGSEQ() {
      PSTG_SEQ = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public LOGTXN_T build() {
      try {
        LOGTXN_T record = new LOGTXN_T();
        record.ACCT_COID = fieldSetFlags()[0] ? this.ACCT_COID : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ACCT_PROD = fieldSetFlags()[1] ? this.ACCT_PROD : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.ACCT_NBR = fieldSetFlags()[2] ? this.ACCT_NBR : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.FILE_ORIG = fieldSetFlags()[3] ? this.FILE_ORIG : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.PSTG_DT = fieldSetFlags()[4] ? this.PSTG_DT : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.PSTG_SEQ = fieldSetFlags()[5] ? this.PSTG_SEQ : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<LOGTXN_T>
    WRITER$ = (org.apache.avro.io.DatumWriter<LOGTXN_T>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<LOGTXN_T>
    READER$ = (org.apache.avro.io.DatumReader<LOGTXN_T>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.ACCT_COID);

    out.writeString(this.ACCT_PROD);

    out.writeString(this.ACCT_NBR);

    out.writeString(this.FILE_ORIG);

    out.writeString(this.PSTG_DT);

    out.writeString(this.PSTG_SEQ);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.ACCT_COID = in.readString(this.ACCT_COID instanceof Utf8 ? (Utf8)this.ACCT_COID : null);

      this.ACCT_PROD = in.readString(this.ACCT_PROD instanceof Utf8 ? (Utf8)this.ACCT_PROD : null);

      this.ACCT_NBR = in.readString(this.ACCT_NBR instanceof Utf8 ? (Utf8)this.ACCT_NBR : null);

      this.FILE_ORIG = in.readString(this.FILE_ORIG instanceof Utf8 ? (Utf8)this.FILE_ORIG : null);

      this.PSTG_DT = in.readString(this.PSTG_DT instanceof Utf8 ? (Utf8)this.PSTG_DT : null);

      this.PSTG_SEQ = in.readString(this.PSTG_SEQ instanceof Utf8 ? (Utf8)this.PSTG_SEQ : null);

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.ACCT_COID = in.readString(this.ACCT_COID instanceof Utf8 ? (Utf8)this.ACCT_COID : null);
          break;

        case 1:
          this.ACCT_PROD = in.readString(this.ACCT_PROD instanceof Utf8 ? (Utf8)this.ACCT_PROD : null);
          break;

        case 2:
          this.ACCT_NBR = in.readString(this.ACCT_NBR instanceof Utf8 ? (Utf8)this.ACCT_NBR : null);
          break;

        case 3:
          this.FILE_ORIG = in.readString(this.FILE_ORIG instanceof Utf8 ? (Utf8)this.FILE_ORIG : null);
          break;

        case 4:
          this.PSTG_DT = in.readString(this.PSTG_DT instanceof Utf8 ? (Utf8)this.PSTG_DT : null);
          break;

        case 5:
          this.PSTG_SEQ = in.readString(this.PSTG_SEQ instanceof Utf8 ? (Utf8)this.PSTG_SEQ : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









