/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tenfour;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-26")
public class ResultGroup implements org.apache.thrift.TBase<ResultGroup, ResultGroup._Fields>, java.io.Serializable, Cloneable, Comparable<ResultGroup> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ResultGroup");

  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SHARE_FIELD_DESC = new org.apache.thrift.protocol.TField("share", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MIN_SCORE_FIELD_DESC = new org.apache.thrift.protocol.TField("minScore", org.apache.thrift.protocol.TType.I16, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ResultGroupStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ResultGroupTupleSchemeFactory());
  }

  public String title; // required
  public String share; // required
  public short minScore; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TITLE((short)1, "title"),
    SHARE((short)2, "share"),
    MIN_SCORE((short)3, "minScore");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TITLE
          return TITLE;
        case 2: // SHARE
          return SHARE;
        case 3: // MIN_SCORE
          return MIN_SCORE;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MINSCORE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SHARE, new org.apache.thrift.meta_data.FieldMetaData("share", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MIN_SCORE, new org.apache.thrift.meta_data.FieldMetaData("minScore", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResultGroup.class, metaDataMap);
  }

  public ResultGroup() {
  }

  public ResultGroup(
    String title,
    String share,
    short minScore)
  {
    this();
    this.title = title;
    this.share = share;
    this.minScore = minScore;
    setMinScoreIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ResultGroup(ResultGroup other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetShare()) {
      this.share = other.share;
    }
    this.minScore = other.minScore;
  }

  public ResultGroup deepCopy() {
    return new ResultGroup(this);
  }

  @Override
  public void clear() {
    this.title = null;
    this.share = null;
    setMinScoreIsSet(false);
    this.minScore = 0;
  }

  public String getTitle() {
    return this.title;
  }

  public ResultGroup setTitle(String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public String getShare() {
    return this.share;
  }

  public ResultGroup setShare(String share) {
    this.share = share;
    return this;
  }

  public void unsetShare() {
    this.share = null;
  }

  /** Returns true if field share is set (has been assigned a value) and false otherwise */
  public boolean isSetShare() {
    return this.share != null;
  }

  public void setShareIsSet(boolean value) {
    if (!value) {
      this.share = null;
    }
  }

  public short getMinScore() {
    return this.minScore;
  }

  public ResultGroup setMinScore(short minScore) {
    this.minScore = minScore;
    setMinScoreIsSet(true);
    return this;
  }

  public void unsetMinScore() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MINSCORE_ISSET_ID);
  }

  /** Returns true if field minScore is set (has been assigned a value) and false otherwise */
  public boolean isSetMinScore() {
    return EncodingUtils.testBit(__isset_bitfield, __MINSCORE_ISSET_ID);
  }

  public void setMinScoreIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MINSCORE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case SHARE:
      if (value == null) {
        unsetShare();
      } else {
        setShare((String)value);
      }
      break;

    case MIN_SCORE:
      if (value == null) {
        unsetMinScore();
      } else {
        setMinScore((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TITLE:
      return getTitle();

    case SHARE:
      return getShare();

    case MIN_SCORE:
      return Short.valueOf(getMinScore());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TITLE:
      return isSetTitle();
    case SHARE:
      return isSetShare();
    case MIN_SCORE:
      return isSetMinScore();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ResultGroup)
      return this.equals((ResultGroup)that);
    return false;
  }

  public boolean equals(ResultGroup that) {
    if (that == null)
      return false;

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_share = true && this.isSetShare();
    boolean that_present_share = true && that.isSetShare();
    if (this_present_share || that_present_share) {
      if (!(this_present_share && that_present_share))
        return false;
      if (!this.share.equals(that.share))
        return false;
    }

    boolean this_present_minScore = true;
    boolean that_present_minScore = true;
    if (this_present_minScore || that_present_minScore) {
      if (!(this_present_minScore && that_present_minScore))
        return false;
      if (this.minScore != that.minScore)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_title = true && (isSetTitle());
    list.add(present_title);
    if (present_title)
      list.add(title);

    boolean present_share = true && (isSetShare());
    list.add(present_share);
    if (present_share)
      list.add(share);

    boolean present_minScore = true;
    list.add(present_minScore);
    if (present_minScore)
      list.add(minScore);

    return list.hashCode();
  }

  @Override
  public int compareTo(ResultGroup other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShare()).compareTo(other.isSetShare());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShare()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.share, other.share);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMinScore()).compareTo(other.isSetMinScore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinScore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.minScore, other.minScore);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ResultGroup(");
    boolean first = true;

    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("share:");
    if (this.share == null) {
      sb.append("null");
    } else {
      sb.append(this.share);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("minScore:");
    sb.append(this.minScore);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (title == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'title' was not present! Struct: " + toString());
    }
    if (share == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'share' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'minScore' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ResultGroupStandardSchemeFactory implements SchemeFactory {
    public ResultGroupStandardScheme getScheme() {
      return new ResultGroupStandardScheme();
    }
  }

  private static class ResultGroupStandardScheme extends StandardScheme<ResultGroup> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ResultGroup struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SHARE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.share = iprot.readString();
              struct.setShareIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MIN_SCORE
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.minScore = iprot.readI16();
              struct.setMinScoreIsSet(true);
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
      if (!struct.isSetMinScore()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'minScore' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ResultGroup struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.title);
        oprot.writeFieldEnd();
      }
      if (struct.share != null) {
        oprot.writeFieldBegin(SHARE_FIELD_DESC);
        oprot.writeString(struct.share);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MIN_SCORE_FIELD_DESC);
      oprot.writeI16(struct.minScore);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResultGroupTupleSchemeFactory implements SchemeFactory {
    public ResultGroupTupleScheme getScheme() {
      return new ResultGroupTupleScheme();
    }
  }

  private static class ResultGroupTupleScheme extends TupleScheme<ResultGroup> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ResultGroup struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.title);
      oprot.writeString(struct.share);
      oprot.writeI16(struct.minScore);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ResultGroup struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.title = iprot.readString();
      struct.setTitleIsSet(true);
      struct.share = iprot.readString();
      struct.setShareIsSet(true);
      struct.minScore = iprot.readI16();
      struct.setMinScoreIsSet(true);
    }
  }

}
