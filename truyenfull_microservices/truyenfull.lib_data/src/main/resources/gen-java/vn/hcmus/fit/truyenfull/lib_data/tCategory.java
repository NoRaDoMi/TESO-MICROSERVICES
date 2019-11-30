/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package vn.hcmus.fit.truyenfull.lib_data;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-11-30")
public class tCategory implements org.apache.thrift.TBase<tCategory, tCategory._Fields>, java.io.Serializable, Cloneable, Comparable<tCategory> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("tCategory");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField URLNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("urlname", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField COMIC_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("comicList", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new tCategoryStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new tCategoryTupleSchemeFactory();

  public long id; // required
  public java.lang.String name; // required
  public java.lang.String urlname; // required
  public java.util.List<tComic> comicList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    URLNAME((short)3, "urlname"),
    COMIC_LIST((short)4, "comicList");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        case 3: // URLNAME
          return URLNAME;
        case 4: // COMIC_LIST
          return COMIC_LIST;
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
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "long")));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.URLNAME, new org.apache.thrift.meta_data.FieldMetaData("urlname", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMIC_LIST, new org.apache.thrift.meta_data.FieldMetaData("comicList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, tComic.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(tCategory.class, metaDataMap);
  }

  public tCategory() {
  }

  public tCategory(
    long id,
    java.lang.String name,
    java.lang.String urlname,
    java.util.List<tComic> comicList)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.name = name;
    this.urlname = urlname;
    this.comicList = comicList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public tCategory(tCategory other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetUrlname()) {
      this.urlname = other.urlname;
    }
    if (other.isSetComicList()) {
      java.util.List<tComic> __this__comicList = new java.util.ArrayList<tComic>(other.comicList.size());
      for (tComic other_element : other.comicList) {
        __this__comicList.add(new tComic(other_element));
      }
      this.comicList = __this__comicList;
    }
  }

  public tCategory deepCopy() {
    return new tCategory(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.name = null;
    this.urlname = null;
    this.comicList = null;
  }

  public long getId() {
    return this.id;
  }

  public tCategory setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public java.lang.String getName() {
    return this.name;
  }

  public tCategory setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public java.lang.String getUrlname() {
    return this.urlname;
  }

  public tCategory setUrlname(java.lang.String urlname) {
    this.urlname = urlname;
    return this;
  }

  public void unsetUrlname() {
    this.urlname = null;
  }

  /** Returns true if field urlname is set (has been assigned a value) and false otherwise */
  public boolean isSetUrlname() {
    return this.urlname != null;
  }

  public void setUrlnameIsSet(boolean value) {
    if (!value) {
      this.urlname = null;
    }
  }

  public int getComicListSize() {
    return (this.comicList == null) ? 0 : this.comicList.size();
  }

  public java.util.Iterator<tComic> getComicListIterator() {
    return (this.comicList == null) ? null : this.comicList.iterator();
  }

  public void addToComicList(tComic elem) {
    if (this.comicList == null) {
      this.comicList = new java.util.ArrayList<tComic>();
    }
    this.comicList.add(elem);
  }

  public java.util.List<tComic> getComicList() {
    return this.comicList;
  }

  public tCategory setComicList(java.util.List<tComic> comicList) {
    this.comicList = comicList;
    return this;
  }

  public void unsetComicList() {
    this.comicList = null;
  }

  /** Returns true if field comicList is set (has been assigned a value) and false otherwise */
  public boolean isSetComicList() {
    return this.comicList != null;
  }

  public void setComicListIsSet(boolean value) {
    if (!value) {
      this.comicList = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case URLNAME:
      if (value == null) {
        unsetUrlname();
      } else {
        setUrlname((java.lang.String)value);
      }
      break;

    case COMIC_LIST:
      if (value == null) {
        unsetComicList();
      } else {
        setComicList((java.util.List<tComic>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case NAME:
      return getName();

    case URLNAME:
      return getUrlname();

    case COMIC_LIST:
      return getComicList();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NAME:
      return isSetName();
    case URLNAME:
      return isSetUrlname();
    case COMIC_LIST:
      return isSetComicList();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof tCategory)
      return this.equals((tCategory)that);
    return false;
  }

  public boolean equals(tCategory that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_urlname = true && this.isSetUrlname();
    boolean that_present_urlname = true && that.isSetUrlname();
    if (this_present_urlname || that_present_urlname) {
      if (!(this_present_urlname && that_present_urlname))
        return false;
      if (!this.urlname.equals(that.urlname))
        return false;
    }

    boolean this_present_comicList = true && this.isSetComicList();
    boolean that_present_comicList = true && that.isSetComicList();
    if (this_present_comicList || that_present_comicList) {
      if (!(this_present_comicList && that_present_comicList))
        return false;
      if (!this.comicList.equals(that.comicList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetUrlname()) ? 131071 : 524287);
    if (isSetUrlname())
      hashCode = hashCode * 8191 + urlname.hashCode();

    hashCode = hashCode * 8191 + ((isSetComicList()) ? 131071 : 524287);
    if (isSetComicList())
      hashCode = hashCode * 8191 + comicList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(tCategory other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUrlname()).compareTo(other.isSetUrlname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUrlname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.urlname, other.urlname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetComicList()).compareTo(other.isSetComicList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComicList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.comicList, other.comicList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("tCategory(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("urlname:");
    if (this.urlname == null) {
      sb.append("null");
    } else {
      sb.append(this.urlname);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("comicList:");
    if (this.comicList == null) {
      sb.append("null");
    } else {
      sb.append(this.comicList);
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

  private static class tCategoryStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public tCategoryStandardScheme getScheme() {
      return new tCategoryStandardScheme();
    }
  }

  private static class tCategoryStandardScheme extends org.apache.thrift.scheme.StandardScheme<tCategory> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, tCategory struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // URLNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.urlname = iprot.readString();
              struct.setUrlnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COMIC_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.comicList = new java.util.ArrayList<tComic>(_list16.size);
                tComic _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = new tComic();
                  _elem17.read(iprot);
                  struct.comicList.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setComicListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, tCategory struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(struct.id);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.urlname != null) {
        oprot.writeFieldBegin(URLNAME_FIELD_DESC);
        oprot.writeString(struct.urlname);
        oprot.writeFieldEnd();
      }
      if (struct.comicList != null) {
        oprot.writeFieldBegin(COMIC_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.comicList.size()));
          for (tComic _iter19 : struct.comicList)
          {
            _iter19.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class tCategoryTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public tCategoryTupleScheme getScheme() {
      return new tCategoryTupleScheme();
    }
  }

  private static class tCategoryTupleScheme extends org.apache.thrift.scheme.TupleScheme<tCategory> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, tCategory struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetUrlname()) {
        optionals.set(2);
      }
      if (struct.isSetComicList()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetUrlname()) {
        oprot.writeString(struct.urlname);
      }
      if (struct.isSetComicList()) {
        {
          oprot.writeI32(struct.comicList.size());
          for (tComic _iter20 : struct.comicList)
          {
            _iter20.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, tCategory struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.urlname = iprot.readString();
        struct.setUrlnameIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.comicList = new java.util.ArrayList<tComic>(_list21.size);
          tComic _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = new tComic();
            _elem22.read(iprot);
            struct.comicList.add(_elem22);
          }
        }
        struct.setComicListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
