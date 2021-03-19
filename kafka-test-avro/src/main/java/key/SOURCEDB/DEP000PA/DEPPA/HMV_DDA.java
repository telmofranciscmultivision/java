/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package key.SOURCEDB.DEP000PA.DEPPA;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class HMV_DDA extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6346715864664937235L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HMV_DDA\",\"namespace\":\"key.SOURCEDB.DEP000PA.DEPPA\",\"fields\":[{\"name\":\"HDDA_KEY_CONTA\",\"type\":\"string\"},{\"name\":\"HDDA_KEY_DATA_LANCAMENTO\",\"type\":\"string\"},{\"name\":\"HDDA_KEY_DATA_HORA\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<HMV_DDA> ENCODER =
      new BinaryMessageEncoder<HMV_DDA>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<HMV_DDA> DECODER =
      new BinaryMessageDecoder<HMV_DDA>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<HMV_DDA> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<HMV_DDA> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<HMV_DDA> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<HMV_DDA>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this HMV_DDA to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a HMV_DDA from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a HMV_DDA instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static HMV_DDA fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence HDDA_KEY_CONTA;
   private java.lang.CharSequence HDDA_KEY_DATA_LANCAMENTO;
   private java.lang.CharSequence HDDA_KEY_DATA_HORA;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HMV_DDA() {}

  /**
   * All-args constructor.
   * @param HDDA_KEY_CONTA The new value for HDDA_KEY_CONTA
   * @param HDDA_KEY_DATA_LANCAMENTO The new value for HDDA_KEY_DATA_LANCAMENTO
   * @param HDDA_KEY_DATA_HORA The new value for HDDA_KEY_DATA_HORA
   */
  public HMV_DDA(java.lang.CharSequence HDDA_KEY_CONTA, java.lang.CharSequence HDDA_KEY_DATA_LANCAMENTO, java.lang.CharSequence HDDA_KEY_DATA_HORA) {
    this.HDDA_KEY_CONTA = HDDA_KEY_CONTA;
    this.HDDA_KEY_DATA_LANCAMENTO = HDDA_KEY_DATA_LANCAMENTO;
    this.HDDA_KEY_DATA_HORA = HDDA_KEY_DATA_HORA;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return HDDA_KEY_CONTA;
    case 1: return HDDA_KEY_DATA_LANCAMENTO;
    case 2: return HDDA_KEY_DATA_HORA;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: HDDA_KEY_CONTA = (java.lang.CharSequence)value$; break;
    case 1: HDDA_KEY_DATA_LANCAMENTO = (java.lang.CharSequence)value$; break;
    case 2: HDDA_KEY_DATA_HORA = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'HDDA_KEY_CONTA' field.
   * @return The value of the 'HDDA_KEY_CONTA' field.
   */
  public java.lang.CharSequence getHDDAKEYCONTA() {
    return HDDA_KEY_CONTA;
  }


  /**
   * Sets the value of the 'HDDA_KEY_CONTA' field.
   * @param value the value to set.
   */
  public void setHDDAKEYCONTA(java.lang.CharSequence value) {
    this.HDDA_KEY_CONTA = value;
  }

  /**
   * Gets the value of the 'HDDA_KEY_DATA_LANCAMENTO' field.
   * @return The value of the 'HDDA_KEY_DATA_LANCAMENTO' field.
   */
  public java.lang.CharSequence getHDDAKEYDATALANCAMENTO() {
    return HDDA_KEY_DATA_LANCAMENTO;
  }


  /**
   * Sets the value of the 'HDDA_KEY_DATA_LANCAMENTO' field.
   * @param value the value to set.
   */
  public void setHDDAKEYDATALANCAMENTO(java.lang.CharSequence value) {
    this.HDDA_KEY_DATA_LANCAMENTO = value;
  }

  /**
   * Gets the value of the 'HDDA_KEY_DATA_HORA' field.
   * @return The value of the 'HDDA_KEY_DATA_HORA' field.
   */
  public java.lang.CharSequence getHDDAKEYDATAHORA() {
    return HDDA_KEY_DATA_HORA;
  }


  /**
   * Sets the value of the 'HDDA_KEY_DATA_HORA' field.
   * @param value the value to set.
   */
  public void setHDDAKEYDATAHORA(java.lang.CharSequence value) {
    this.HDDA_KEY_DATA_HORA = value;
  }

  /**
   * Creates a new HMV_DDA RecordBuilder.
   * @return A new HMV_DDA RecordBuilder
   */
  public static key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder newBuilder() {
    return new key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder();
  }

  /**
   * Creates a new HMV_DDA RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HMV_DDA RecordBuilder
   */
  public static key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder newBuilder(key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder other) {
    if (other == null) {
      return new key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder();
    } else {
      return new key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder(other);
    }
  }

  /**
   * Creates a new HMV_DDA RecordBuilder by copying an existing HMV_DDA instance.
   * @param other The existing instance to copy.
   * @return A new HMV_DDA RecordBuilder
   */
  public static key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder newBuilder(key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA other) {
    if (other == null) {
      return new key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder();
    } else {
      return new key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder(other);
    }
  }

  /**
   * RecordBuilder for HMV_DDA instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HMV_DDA>
    implements org.apache.avro.data.RecordBuilder<HMV_DDA> {

    private java.lang.CharSequence HDDA_KEY_CONTA;
    private java.lang.CharSequence HDDA_KEY_DATA_LANCAMENTO;
    private java.lang.CharSequence HDDA_KEY_DATA_HORA;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.HDDA_KEY_CONTA)) {
        this.HDDA_KEY_CONTA = data().deepCopy(fields()[0].schema(), other.HDDA_KEY_CONTA);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.HDDA_KEY_DATA_LANCAMENTO)) {
        this.HDDA_KEY_DATA_LANCAMENTO = data().deepCopy(fields()[1].schema(), other.HDDA_KEY_DATA_LANCAMENTO);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.HDDA_KEY_DATA_HORA)) {
        this.HDDA_KEY_DATA_HORA = data().deepCopy(fields()[2].schema(), other.HDDA_KEY_DATA_HORA);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing HMV_DDA instance
     * @param other The existing instance to copy.
     */
    private Builder(key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.HDDA_KEY_CONTA)) {
        this.HDDA_KEY_CONTA = data().deepCopy(fields()[0].schema(), other.HDDA_KEY_CONTA);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.HDDA_KEY_DATA_LANCAMENTO)) {
        this.HDDA_KEY_DATA_LANCAMENTO = data().deepCopy(fields()[1].schema(), other.HDDA_KEY_DATA_LANCAMENTO);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.HDDA_KEY_DATA_HORA)) {
        this.HDDA_KEY_DATA_HORA = data().deepCopy(fields()[2].schema(), other.HDDA_KEY_DATA_HORA);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'HDDA_KEY_CONTA' field.
      * @return The value.
      */
    public java.lang.CharSequence getHDDAKEYCONTA() {
      return HDDA_KEY_CONTA;
    }


    /**
      * Sets the value of the 'HDDA_KEY_CONTA' field.
      * @param value The value of 'HDDA_KEY_CONTA'.
      * @return This builder.
      */
    public key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder setHDDAKEYCONTA(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.HDDA_KEY_CONTA = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'HDDA_KEY_CONTA' field has been set.
      * @return True if the 'HDDA_KEY_CONTA' field has been set, false otherwise.
      */
    public boolean hasHDDAKEYCONTA() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'HDDA_KEY_CONTA' field.
      * @return This builder.
      */
    public key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder clearHDDAKEYCONTA() {
      HDDA_KEY_CONTA = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'HDDA_KEY_DATA_LANCAMENTO' field.
      * @return The value.
      */
    public java.lang.CharSequence getHDDAKEYDATALANCAMENTO() {
      return HDDA_KEY_DATA_LANCAMENTO;
    }


    /**
      * Sets the value of the 'HDDA_KEY_DATA_LANCAMENTO' field.
      * @param value The value of 'HDDA_KEY_DATA_LANCAMENTO'.
      * @return This builder.
      */
    public key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder setHDDAKEYDATALANCAMENTO(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.HDDA_KEY_DATA_LANCAMENTO = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'HDDA_KEY_DATA_LANCAMENTO' field has been set.
      * @return True if the 'HDDA_KEY_DATA_LANCAMENTO' field has been set, false otherwise.
      */
    public boolean hasHDDAKEYDATALANCAMENTO() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'HDDA_KEY_DATA_LANCAMENTO' field.
      * @return This builder.
      */
    public key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder clearHDDAKEYDATALANCAMENTO() {
      HDDA_KEY_DATA_LANCAMENTO = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'HDDA_KEY_DATA_HORA' field.
      * @return The value.
      */
    public java.lang.CharSequence getHDDAKEYDATAHORA() {
      return HDDA_KEY_DATA_HORA;
    }


    /**
      * Sets the value of the 'HDDA_KEY_DATA_HORA' field.
      * @param value The value of 'HDDA_KEY_DATA_HORA'.
      * @return This builder.
      */
    public key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder setHDDAKEYDATAHORA(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.HDDA_KEY_DATA_HORA = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'HDDA_KEY_DATA_HORA' field has been set.
      * @return True if the 'HDDA_KEY_DATA_HORA' field has been set, false otherwise.
      */
    public boolean hasHDDAKEYDATAHORA() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'HDDA_KEY_DATA_HORA' field.
      * @return This builder.
      */
    public key.SOURCEDB.DEP000PA.DEPPA.HMV_DDA.Builder clearHDDAKEYDATAHORA() {
      HDDA_KEY_DATA_HORA = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public HMV_DDA build() {
      try {
        HMV_DDA record = new HMV_DDA();
        record.HDDA_KEY_CONTA = fieldSetFlags()[0] ? this.HDDA_KEY_CONTA : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.HDDA_KEY_DATA_LANCAMENTO = fieldSetFlags()[1] ? this.HDDA_KEY_DATA_LANCAMENTO : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.HDDA_KEY_DATA_HORA = fieldSetFlags()[2] ? this.HDDA_KEY_DATA_HORA : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<HMV_DDA>
    WRITER$ = (org.apache.avro.io.DatumWriter<HMV_DDA>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<HMV_DDA>
    READER$ = (org.apache.avro.io.DatumReader<HMV_DDA>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.HDDA_KEY_CONTA);

    out.writeString(this.HDDA_KEY_DATA_LANCAMENTO);

    out.writeString(this.HDDA_KEY_DATA_HORA);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.HDDA_KEY_CONTA = in.readString(this.HDDA_KEY_CONTA instanceof Utf8 ? (Utf8)this.HDDA_KEY_CONTA : null);

      this.HDDA_KEY_DATA_LANCAMENTO = in.readString(this.HDDA_KEY_DATA_LANCAMENTO instanceof Utf8 ? (Utf8)this.HDDA_KEY_DATA_LANCAMENTO : null);

      this.HDDA_KEY_DATA_HORA = in.readString(this.HDDA_KEY_DATA_HORA instanceof Utf8 ? (Utf8)this.HDDA_KEY_DATA_HORA : null);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.HDDA_KEY_CONTA = in.readString(this.HDDA_KEY_CONTA instanceof Utf8 ? (Utf8)this.HDDA_KEY_CONTA : null);
          break;

        case 1:
          this.HDDA_KEY_DATA_LANCAMENTO = in.readString(this.HDDA_KEY_DATA_LANCAMENTO instanceof Utf8 ? (Utf8)this.HDDA_KEY_DATA_LANCAMENTO : null);
          break;

        case 2:
          this.HDDA_KEY_DATA_HORA = in.readString(this.HDDA_KEY_DATA_HORA instanceof Utf8 ? (Utf8)this.HDDA_KEY_DATA_HORA : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










