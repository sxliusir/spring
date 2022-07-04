/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.thrift.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.15.0)", date = "2021-12-24")
public class UserPage implements org.apache.thrift.TBase<UserPage, UserPage._Fields>, java.io.Serializable, Cloneable, Comparable<UserPage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserPage");

  private static final org.apache.thrift.protocol.TField PAGE_NO_FIELD_DESC = new org.apache.thrift.protocol.TField("pageNo", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TOTAL_FIELD_DESC = new org.apache.thrift.protocol.TField("total", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("result", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserPageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserPageTupleSchemeFactory();

  public int pageNo; // required
  public int total; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<User> result; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PAGE_NO((short)1, "pageNo"),
    TOTAL((short)2, "total"),
    RESULT((short)3, "result");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PAGE_NO
          return PAGE_NO;
        case 2: // TOTAL
          return TOTAL;
        case 3: // RESULT
          return RESULT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PAGENO_ISSET_ID = 0;
  private static final int __TOTAL_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PAGE_NO, new org.apache.thrift.meta_data.FieldMetaData("pageNo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOTAL, new org.apache.thrift.meta_data.FieldMetaData("total", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RESULT, new org.apache.thrift.meta_data.FieldMetaData("result", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, User.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserPage.class, metaDataMap);
  }

  public UserPage() {
  }

  public UserPage(
    int pageNo,
    int total,
    java.util.List<User> result)
  {
    this();
    this.pageNo = pageNo;
    setPageNoIsSet(true);
    this.total = total;
    setTotalIsSet(true);
    this.result = result;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserPage(UserPage other) {
    __isset_bitfield = other.__isset_bitfield;
    this.pageNo = other.pageNo;
    this.total = other.total;
    if (other.isSetResult()) {
      java.util.List<User> __this__result = new java.util.ArrayList<User>(other.result.size());
      for (User other_element : other.result) {
        __this__result.add(new User(other_element));
      }
      this.result = __this__result;
    }
  }

  public UserPage deepCopy() {
    return new UserPage(this);
  }

  @Override
  public void clear() {
    setPageNoIsSet(false);
    this.pageNo = 0;
    setTotalIsSet(false);
    this.total = 0;
    this.result = null;
  }

  public int getPageNo() {
    return this.pageNo;
  }

  public UserPage setPageNo(int pageNo) {
    this.pageNo = pageNo;
    setPageNoIsSet(true);
    return this;
  }

  public void unsetPageNo() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PAGENO_ISSET_ID);
  }

  /** Returns true if field pageNo is set (has been assigned a value) and false otherwise */
  public boolean isSetPageNo() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PAGENO_ISSET_ID);
  }

  public void setPageNoIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PAGENO_ISSET_ID, value);
  }

  public int getTotal() {
    return this.total;
  }

  public UserPage setTotal(int total) {
    this.total = total;
    setTotalIsSet(true);
    return this;
  }

  public void unsetTotal() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTAL_ISSET_ID);
  }

  /** Returns true if field total is set (has been assigned a value) and false otherwise */
  public boolean isSetTotal() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTAL_ISSET_ID);
  }

  public void setTotalIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTAL_ISSET_ID, value);
  }

  public int getResultSize() {
    return (this.result == null) ? 0 : this.result.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<User> getResultIterator() {
    return (this.result == null) ? null : this.result.iterator();
  }

  public void addToResult(User elem) {
    if (this.result == null) {
      this.result = new java.util.ArrayList<User>();
    }
    this.result.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<User> getResult() {
    return this.result;
  }

  public UserPage setResult(@org.apache.thrift.annotation.Nullable java.util.List<User> result) {
    this.result = result;
    return this;
  }

  public void unsetResult() {
    this.result = null;
  }

  /** Returns true if field result is set (has been assigned a value) and false otherwise */
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean value) {
    if (!value) {
      this.result = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PAGE_NO:
      if (value == null) {
        unsetPageNo();
      } else {
        setPageNo((java.lang.Integer)value);
      }
      break;

    case TOTAL:
      if (value == null) {
        unsetTotal();
      } else {
        setTotal((java.lang.Integer)value);
      }
      break;

    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((java.util.List<User>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PAGE_NO:
      return getPageNo();

    case TOTAL:
      return getTotal();

    case RESULT:
      return getResult();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PAGE_NO:
      return isSetPageNo();
    case TOTAL:
      return isSetTotal();
    case RESULT:
      return isSetResult();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof UserPage)
      return this.equals((UserPage)that);
    return false;
  }

  public boolean equals(UserPage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_pageNo = true;
    boolean that_present_pageNo = true;
    if (this_present_pageNo || that_present_pageNo) {
      if (!(this_present_pageNo && that_present_pageNo))
        return false;
      if (this.pageNo != that.pageNo)
        return false;
    }

    boolean this_present_total = true;
    boolean that_present_total = true;
    if (this_present_total || that_present_total) {
      if (!(this_present_total && that_present_total))
        return false;
      if (this.total != that.total)
        return false;
    }

    boolean this_present_result = true && this.isSetResult();
    boolean that_present_result = true && that.isSetResult();
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (!this.result.equals(that.result))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + pageNo;

    hashCode = hashCode * 8191 + total;

    hashCode = hashCode * 8191 + ((isSetResult()) ? 131071 : 524287);
    if (isSetResult())
      hashCode = hashCode * 8191 + result.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UserPage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPageNo(), other.isSetPageNo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageNo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pageNo, other.pageNo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTotal(), other.isSetTotal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.total, other.total);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetResult(), other.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.result, other.result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UserPage(");
    boolean first = true;

    sb.append("pageNo:");
    sb.append(this.pageNo);
    first = false;
    if (!first) sb.append(", ");
    sb.append("total:");
    sb.append(this.total);
    first = false;
    if (!first) sb.append(", ");
    sb.append("result:");
    if (this.result == null) {
      sb.append("null");
    } else {
      sb.append(this.result);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserPageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserPageStandardScheme getScheme() {
      return new UserPageStandardScheme();
    }
  }

  private static class UserPageStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserPage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserPage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PAGE_NO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pageNo = iprot.readI32();
              struct.setPageNoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOTAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.total = iprot.readI32();
              struct.setTotalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.result = new java.util.ArrayList<User>(_list8.size);
                @org.apache.thrift.annotation.Nullable User _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new User();
                  _elem9.read(iprot);
                  struct.result.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setResultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserPage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PAGE_NO_FIELD_DESC);
      oprot.writeI32(struct.pageNo);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TOTAL_FIELD_DESC);
      oprot.writeI32(struct.total);
      oprot.writeFieldEnd();
      if (struct.result != null) {
        oprot.writeFieldBegin(RESULT_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.result.size()));
          for (User _iter11 : struct.result)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserPageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserPageTupleScheme getScheme() {
      return new UserPageTupleScheme();
    }
  }

  private static class UserPageTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserPage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserPage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPageNo()) {
        optionals.set(0);
      }
      if (struct.isSetTotal()) {
        optionals.set(1);
      }
      if (struct.isSetResult()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPageNo()) {
        oprot.writeI32(struct.pageNo);
      }
      if (struct.isSetTotal()) {
        oprot.writeI32(struct.total);
      }
      if (struct.isSetResult()) {
        {
          oprot.writeI32(struct.result.size());
          for (User _iter12 : struct.result)
          {
            _iter12.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserPage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.pageNo = iprot.readI32();
        struct.setPageNoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.total = iprot.readI32();
        struct.setTotalIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list13 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.result = new java.util.ArrayList<User>(_list13.size);
          @org.apache.thrift.annotation.Nullable User _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new User();
            _elem14.read(iprot);
            struct.result.add(_elem14);
          }
        }
        struct.setResultIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
