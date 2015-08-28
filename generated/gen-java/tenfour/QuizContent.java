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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-27")
public class QuizContent implements org.apache.thrift.TBase<QuizContent, QuizContent._Fields>, java.io.Serializable, Cloneable, Comparable<QuizContent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QuizContent");

  private static final org.apache.thrift.protocol.TField QUESTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("questions", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField RESULT_GROUPS_FIELD_DESC = new org.apache.thrift.protocol.TField("resultGroups", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QuizContentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QuizContentTupleSchemeFactory());
  }

  public List<Question> questions; // required
  public ResultGroups resultGroups; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QUESTIONS((short)1, "questions"),
    RESULT_GROUPS((short)2, "resultGroups");

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
        case 1: // QUESTIONS
          return QUESTIONS;
        case 2: // RESULT_GROUPS
          return RESULT_GROUPS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUESTIONS, new org.apache.thrift.meta_data.FieldMetaData("questions", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "Question"))));
    tmpMap.put(_Fields.RESULT_GROUPS, new org.apache.thrift.meta_data.FieldMetaData("resultGroups", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "ResultGroups")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QuizContent.class, metaDataMap);
  }

  public QuizContent() {
  }

  public QuizContent(
    List<Question> questions,
    ResultGroups resultGroups)
  {
    this();
    this.questions = questions;
    this.resultGroups = resultGroups;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QuizContent(QuizContent other) {
    if (other.isSetQuestions()) {
      List<Question> __this__questions = new ArrayList<Question>(other.questions.size());
      for (Question other_element : other.questions) {
        __this__questions.add(other_element);
      }
      this.questions = __this__questions;
    }
    if (other.isSetResultGroups()) {
      this.resultGroups = other.resultGroups;
    }
  }

  public QuizContent deepCopy() {
    return new QuizContent(this);
  }

  @Override
  public void clear() {
    this.questions = null;
    this.resultGroups = null;
  }

  public int getQuestionsSize() {
    return (this.questions == null) ? 0 : this.questions.size();
  }

  public java.util.Iterator<Question> getQuestionsIterator() {
    return (this.questions == null) ? null : this.questions.iterator();
  }

  public void addToQuestions(Question elem) {
    if (this.questions == null) {
      this.questions = new ArrayList<Question>();
    }
    this.questions.add(elem);
  }

  public List<Question> getQuestions() {
    return this.questions;
  }

  public QuizContent setQuestions(List<Question> questions) {
    this.questions = questions;
    return this;
  }

  public void unsetQuestions() {
    this.questions = null;
  }

  /** Returns true if field questions is set (has been assigned a value) and false otherwise */
  public boolean isSetQuestions() {
    return this.questions != null;
  }

  public void setQuestionsIsSet(boolean value) {
    if (!value) {
      this.questions = null;
    }
  }

  public ResultGroups getResultGroups() {
    return this.resultGroups;
  }

  public QuizContent setResultGroups(ResultGroups resultGroups) {
    this.resultGroups = resultGroups;
    return this;
  }

  public void unsetResultGroups() {
    this.resultGroups = null;
  }

  /** Returns true if field resultGroups is set (has been assigned a value) and false otherwise */
  public boolean isSetResultGroups() {
    return this.resultGroups != null;
  }

  public void setResultGroupsIsSet(boolean value) {
    if (!value) {
      this.resultGroups = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUESTIONS:
      if (value == null) {
        unsetQuestions();
      } else {
        setQuestions((List<Question>)value);
      }
      break;

    case RESULT_GROUPS:
      if (value == null) {
        unsetResultGroups();
      } else {
        setResultGroups((ResultGroups)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUESTIONS:
      return getQuestions();

    case RESULT_GROUPS:
      return getResultGroups();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUESTIONS:
      return isSetQuestions();
    case RESULT_GROUPS:
      return isSetResultGroups();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QuizContent)
      return this.equals((QuizContent)that);
    return false;
  }

  public boolean equals(QuizContent that) {
    if (that == null)
      return false;

    boolean this_present_questions = true && this.isSetQuestions();
    boolean that_present_questions = true && that.isSetQuestions();
    if (this_present_questions || that_present_questions) {
      if (!(this_present_questions && that_present_questions))
        return false;
      if (!this.questions.equals(that.questions))
        return false;
    }

    boolean this_present_resultGroups = true && this.isSetResultGroups();
    boolean that_present_resultGroups = true && that.isSetResultGroups();
    if (this_present_resultGroups || that_present_resultGroups) {
      if (!(this_present_resultGroups && that_present_resultGroups))
        return false;
      if (!this.resultGroups.equals(that.resultGroups))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_questions = true && (isSetQuestions());
    list.add(present_questions);
    if (present_questions)
      list.add(questions);

    boolean present_resultGroups = true && (isSetResultGroups());
    list.add(present_resultGroups);
    if (present_resultGroups)
      list.add(resultGroups);

    return list.hashCode();
  }

  @Override
  public int compareTo(QuizContent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQuestions()).compareTo(other.isSetQuestions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuestions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.questions, other.questions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResultGroups()).compareTo(other.isSetResultGroups());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResultGroups()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resultGroups, other.resultGroups);
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
    StringBuilder sb = new StringBuilder("QuizContent(");
    boolean first = true;

    sb.append("questions:");
    if (this.questions == null) {
      sb.append("null");
    } else {
      sb.append(this.questions);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("resultGroups:");
    if (this.resultGroups == null) {
      sb.append("null");
    } else {
      sb.append(this.resultGroups);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (questions == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'questions' was not present! Struct: " + toString());
    }
    if (resultGroups == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'resultGroups' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class QuizContentStandardSchemeFactory implements SchemeFactory {
    public QuizContentStandardScheme getScheme() {
      return new QuizContentStandardScheme();
    }
  }

  private static class QuizContentStandardScheme extends StandardScheme<QuizContent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, QuizContent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUESTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.questions = new ArrayList<Question>(_list0.size);
                Question _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new Question();
                  _elem1.read(iprot);
                  struct.questions.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setQuestionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESULT_GROUPS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.resultGroups = new ResultGroups();
              struct.resultGroups.read(iprot);
              struct.setResultGroupsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, QuizContent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.questions != null) {
        oprot.writeFieldBegin(QUESTIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.questions.size()));
          for (Question _iter3 : struct.questions)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.resultGroups != null) {
        oprot.writeFieldBegin(RESULT_GROUPS_FIELD_DESC);
        struct.resultGroups.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QuizContentTupleSchemeFactory implements SchemeFactory {
    public QuizContentTupleScheme getScheme() {
      return new QuizContentTupleScheme();
    }
  }

  private static class QuizContentTupleScheme extends TupleScheme<QuizContent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, QuizContent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.questions.size());
        for (Question _iter4 : struct.questions)
        {
          _iter4.write(oprot);
        }
      }
      struct.resultGroups.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, QuizContent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.questions = new ArrayList<Question>(_list5.size);
        Question _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = new Question();
          _elem6.read(iprot);
          struct.questions.add(_elem6);
        }
      }
      struct.setQuestionsIsSet(true);
      struct.resultGroups = new ResultGroups();
      struct.resultGroups.read(iprot);
      struct.setResultGroupsIsSet(true);
    }
  }

}

