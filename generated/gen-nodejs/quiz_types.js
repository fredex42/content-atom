//
// Autogenerated by Thrift Compiler (0.9.2)
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//
var thrift = require('thrift');
var Thrift = thrift.Thrift;
var Q = thrift.Q;

var shared_ttypes = require('./shared_types')


var ttypes = module.exports = {};
if (typeof contentatom === 'undefined') {
  contentatom = {};
}
if (typeof contentatom.quiz === 'undefined') {
  contentatom.quiz = {};
}
contentatom.quiz.QuizAtom = module.exports.QuizAtom = function(args) {
  this.id = null;
  this.title = null;
  this.updatedBy = null;
  this.updatedAt = null;
  this.createdAt = null;
  this.createdBy = null;
  this.published = null;
  this.quizType = null;
  this.defaultColumns = null;
  this.content = null;
  if (args) {
    if (args.id !== undefined) {
      this.id = args.id;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field id is unset!');
    }
    if (args.title !== undefined) {
      this.title = args.title;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field title is unset!');
    }
    if (args.updatedBy !== undefined) {
      this.updatedBy = args.updatedBy;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field updatedBy is unset!');
    }
    if (args.updatedAt !== undefined) {
      this.updatedAt = args.updatedAt;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field updatedAt is unset!');
    }
    if (args.createdAt !== undefined) {
      this.createdAt = args.createdAt;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field createdAt is unset!');
    }
    if (args.createdBy !== undefined) {
      this.createdBy = args.createdBy;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field createdBy is unset!');
    }
    if (args.published !== undefined) {
      this.published = args.published;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field published is unset!');
    }
    if (args.quizType !== undefined) {
      this.quizType = args.quizType;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field quizType is unset!');
    }
    if (args.defaultColumns !== undefined) {
      this.defaultColumns = args.defaultColumns;
    }
    if (args.content !== undefined) {
      this.content = args.content;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field content is unset!');
    }
  }
};
contentatom.quiz.QuizAtom.prototype = {};
contentatom.quiz.QuizAtom.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.id = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.title = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRING) {
        this.updatedBy = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.I64) {
        this.updatedAt = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.I64) {
        this.createdAt = input.readI64();
      } else {
        input.skip(ftype);
      }
      break;
      case 6:
      if (ftype == Thrift.Type.STRING) {
        this.createdBy = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 7:
      if (ftype == Thrift.Type.BOOL) {
        this.published = input.readBool();
      } else {
        input.skip(ftype);
      }
      break;
      case 8:
      if (ftype == Thrift.Type.STRING) {
        this.quizType = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 9:
      if (ftype == Thrift.Type.I16) {
        this.defaultColumns = input.readI16();
      } else {
        input.skip(ftype);
      }
      break;
      case 10:
      if (ftype == Thrift.Type.STRUCT) {
        this.content = new ttypes.ItemContent();
        this.content.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

contentatom.quiz.QuizAtom.prototype.write = function(output) {
  output.writeStructBegin('QuizAtom');
  if (this.id !== null && this.id !== undefined) {
    output.writeFieldBegin('id', Thrift.Type.STRING, 1);
    output.writeString(this.id);
    output.writeFieldEnd();
  }
  if (this.title !== null && this.title !== undefined) {
    output.writeFieldBegin('title', Thrift.Type.STRING, 2);
    output.writeString(this.title);
    output.writeFieldEnd();
  }
  if (this.updatedBy !== null && this.updatedBy !== undefined) {
    output.writeFieldBegin('updatedBy', Thrift.Type.STRING, 3);
    output.writeString(this.updatedBy);
    output.writeFieldEnd();
  }
  if (this.updatedAt !== null && this.updatedAt !== undefined) {
    output.writeFieldBegin('updatedAt', Thrift.Type.I64, 4);
    output.writeI64(this.updatedAt);
    output.writeFieldEnd();
  }
  if (this.createdAt !== null && this.createdAt !== undefined) {
    output.writeFieldBegin('createdAt', Thrift.Type.I64, 5);
    output.writeI64(this.createdAt);
    output.writeFieldEnd();
  }
  if (this.createdBy !== null && this.createdBy !== undefined) {
    output.writeFieldBegin('createdBy', Thrift.Type.STRING, 6);
    output.writeString(this.createdBy);
    output.writeFieldEnd();
  }
  if (this.published !== null && this.published !== undefined) {
    output.writeFieldBegin('published', Thrift.Type.BOOL, 7);
    output.writeBool(this.published);
    output.writeFieldEnd();
  }
  if (this.quizType !== null && this.quizType !== undefined) {
    output.writeFieldBegin('quizType', Thrift.Type.STRING, 8);
    output.writeString(this.quizType);
    output.writeFieldEnd();
  }
  if (this.defaultColumns !== null && this.defaultColumns !== undefined) {
    output.writeFieldBegin('defaultColumns', Thrift.Type.I16, 9);
    output.writeI16(this.defaultColumns);
    output.writeFieldEnd();
  }
  if (this.content !== null && this.content !== undefined) {
    output.writeFieldBegin('content', Thrift.Type.STRUCT, 10);
    this.content.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

contentatom.quiz.ItemContent = module.exports.ItemContent = function(args) {
  this.quiz = null;
  if (args) {
    if (args.quiz !== undefined) {
      this.quiz = args.quiz;
    }
  }
};
contentatom.quiz.ItemContent.prototype = {};
contentatom.quiz.ItemContent.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRUCT) {
        this.quiz = new ttypes.QuizContent();
        this.quiz.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 0:
        input.skip(ftype);
        break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

contentatom.quiz.ItemContent.prototype.write = function(output) {
  output.writeStructBegin('ItemContent');
  if (this.quiz !== null && this.quiz !== undefined) {
    output.writeFieldBegin('quiz', Thrift.Type.STRUCT, 1);
    this.quiz.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

contentatom.quiz.QuizContent = module.exports.QuizContent = function(args) {
  this.questions = null;
  this.resultGroups = null;
  if (args) {
    if (args.questions !== undefined) {
      this.questions = args.questions;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field questions is unset!');
    }
    if (args.resultGroups !== undefined) {
      this.resultGroups = args.resultGroups;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field resultGroups is unset!');
    }
  }
};
contentatom.quiz.QuizContent.prototype = {};
contentatom.quiz.QuizContent.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.LIST) {
        var _size0 = 0;
        var _rtmp34;
        this.questions = [];
        var _etype3 = 0;
        _rtmp34 = input.readListBegin();
        _etype3 = _rtmp34.etype;
        _size0 = _rtmp34.size;
        for (var _i5 = 0; _i5 < _size0; ++_i5)
        {
          var elem6 = null;
          elem6 = new ttypes.Question();
          elem6.read(input);
          this.questions.push(elem6);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRUCT) {
        this.resultGroups = new ttypes.ResultGroups();
        this.resultGroups.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

contentatom.quiz.QuizContent.prototype.write = function(output) {
  output.writeStructBegin('QuizContent');
  if (this.questions !== null && this.questions !== undefined) {
    output.writeFieldBegin('questions', Thrift.Type.LIST, 1);
    output.writeListBegin(Thrift.Type.STRUCT, this.questions.length);
    for (var iter7 in this.questions)
    {
      if (this.questions.hasOwnProperty(iter7))
      {
        iter7 = this.questions[iter7];
        iter7.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.resultGroups !== null && this.resultGroups !== undefined) {
    output.writeFieldBegin('resultGroups', Thrift.Type.STRUCT, 2);
    this.resultGroups.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

contentatom.quiz.ResultGroups = module.exports.ResultGroups = function(args) {
  this.groups = null;
  this.revealAtEnd = null;
  if (args) {
    if (args.groups !== undefined) {
      this.groups = args.groups;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field groups is unset!');
    }
    if (args.revealAtEnd !== undefined) {
      this.revealAtEnd = args.revealAtEnd;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field revealAtEnd is unset!');
    }
  }
};
contentatom.quiz.ResultGroups.prototype = {};
contentatom.quiz.ResultGroups.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.LIST) {
        var _size8 = 0;
        var _rtmp312;
        this.groups = [];
        var _etype11 = 0;
        _rtmp312 = input.readListBegin();
        _etype11 = _rtmp312.etype;
        _size8 = _rtmp312.size;
        for (var _i13 = 0; _i13 < _size8; ++_i13)
        {
          var elem14 = null;
          elem14 = new ttypes.ResultGroup();
          elem14.read(input);
          this.groups.push(elem14);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.BOOL) {
        this.revealAtEnd = input.readBool();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

contentatom.quiz.ResultGroups.prototype.write = function(output) {
  output.writeStructBegin('ResultGroups');
  if (this.groups !== null && this.groups !== undefined) {
    output.writeFieldBegin('groups', Thrift.Type.LIST, 1);
    output.writeListBegin(Thrift.Type.STRUCT, this.groups.length);
    for (var iter15 in this.groups)
    {
      if (this.groups.hasOwnProperty(iter15))
      {
        iter15 = this.groups[iter15];
        iter15.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.revealAtEnd !== null && this.revealAtEnd !== undefined) {
    output.writeFieldBegin('revealAtEnd', Thrift.Type.BOOL, 2);
    output.writeBool(this.revealAtEnd);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

contentatom.quiz.ResultGroup = module.exports.ResultGroup = function(args) {
  this.title = null;
  this.share = null;
  this.minScore = null;
  if (args) {
    if (args.title !== undefined) {
      this.title = args.title;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field title is unset!');
    }
    if (args.share !== undefined) {
      this.share = args.share;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field share is unset!');
    }
    if (args.minScore !== undefined) {
      this.minScore = args.minScore;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field minScore is unset!');
    }
  }
};
contentatom.quiz.ResultGroup.prototype = {};
contentatom.quiz.ResultGroup.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.title = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.share = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I16) {
        this.minScore = input.readI16();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

contentatom.quiz.ResultGroup.prototype.write = function(output) {
  output.writeStructBegin('ResultGroup');
  if (this.title !== null && this.title !== undefined) {
    output.writeFieldBegin('title', Thrift.Type.STRING, 1);
    output.writeString(this.title);
    output.writeFieldEnd();
  }
  if (this.share !== null && this.share !== undefined) {
    output.writeFieldBegin('share', Thrift.Type.STRING, 2);
    output.writeString(this.share);
    output.writeFieldEnd();
  }
  if (this.minScore !== null && this.minScore !== undefined) {
    output.writeFieldBegin('minScore', Thrift.Type.I16, 3);
    output.writeI16(this.minScore);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

contentatom.quiz.Question = module.exports.Question = function(args) {
  this.questionText = null;
  this.assets = null;
  this.answers = null;
  if (args) {
    if (args.questionText !== undefined) {
      this.questionText = args.questionText;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field questionText is unset!');
    }
    if (args.assets !== undefined) {
      this.assets = args.assets;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field assets is unset!');
    }
    if (args.answers !== undefined) {
      this.answers = args.answers;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field answers is unset!');
    }
  }
};
contentatom.quiz.Question.prototype = {};
contentatom.quiz.Question.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.questionText = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.LIST) {
        var _size16 = 0;
        var _rtmp320;
        this.assets = [];
        var _etype19 = 0;
        _rtmp320 = input.readListBegin();
        _etype19 = _rtmp320.etype;
        _size16 = _rtmp320.size;
        for (var _i21 = 0; _i21 < _size16; ++_i21)
        {
          var elem22 = null;
          elem22 = new ttypes.Asset();
          elem22.read(input);
          this.assets.push(elem22);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.LIST) {
        var _size23 = 0;
        var _rtmp327;
        this.answers = [];
        var _etype26 = 0;
        _rtmp327 = input.readListBegin();
        _etype26 = _rtmp327.etype;
        _size23 = _rtmp327.size;
        for (var _i28 = 0; _i28 < _size23; ++_i28)
        {
          var elem29 = null;
          elem29 = new ttypes.Answer();
          elem29.read(input);
          this.answers.push(elem29);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

contentatom.quiz.Question.prototype.write = function(output) {
  output.writeStructBegin('Question');
  if (this.questionText !== null && this.questionText !== undefined) {
    output.writeFieldBegin('questionText', Thrift.Type.STRING, 1);
    output.writeString(this.questionText);
    output.writeFieldEnd();
  }
  if (this.assets !== null && this.assets !== undefined) {
    output.writeFieldBegin('assets', Thrift.Type.LIST, 2);
    output.writeListBegin(Thrift.Type.STRUCT, this.assets.length);
    for (var iter30 in this.assets)
    {
      if (this.assets.hasOwnProperty(iter30))
      {
        iter30 = this.assets[iter30];
        iter30.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.answers !== null && this.answers !== undefined) {
    output.writeFieldBegin('answers', Thrift.Type.LIST, 3);
    output.writeListBegin(Thrift.Type.STRUCT, this.answers.length);
    for (var iter31 in this.answers)
    {
      if (this.answers.hasOwnProperty(iter31))
      {
        iter31 = this.answers[iter31];
        iter31.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

contentatom.quiz.Answer = module.exports.Answer = function(args) {
  this.answerText = null;
  this.assets = null;
  this.weight = null;
  this.revealText = null;
  if (args) {
    if (args.answerText !== undefined) {
      this.answerText = args.answerText;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field answerText is unset!');
    }
    if (args.assets !== undefined) {
      this.assets = args.assets;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field assets is unset!');
    }
    if (args.weight !== undefined) {
      this.weight = args.weight;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field weight is unset!');
    }
    if (args.revealText !== undefined) {
      this.revealText = args.revealText;
    }
  }
};
contentatom.quiz.Answer.prototype = {};
contentatom.quiz.Answer.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.answerText = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.LIST) {
        var _size32 = 0;
        var _rtmp336;
        this.assets = [];
        var _etype35 = 0;
        _rtmp336 = input.readListBegin();
        _etype35 = _rtmp336.etype;
        _size32 = _rtmp336.size;
        for (var _i37 = 0; _i37 < _size32; ++_i37)
        {
          var elem38 = null;
          elem38 = new ttypes.Asset();
          elem38.read(input);
          this.assets.push(elem38);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I16) {
        this.weight = input.readI16();
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.STRING) {
        this.revealText = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

contentatom.quiz.Answer.prototype.write = function(output) {
  output.writeStructBegin('Answer');
  if (this.answerText !== null && this.answerText !== undefined) {
    output.writeFieldBegin('answerText', Thrift.Type.STRING, 1);
    output.writeString(this.answerText);
    output.writeFieldEnd();
  }
  if (this.assets !== null && this.assets !== undefined) {
    output.writeFieldBegin('assets', Thrift.Type.LIST, 2);
    output.writeListBegin(Thrift.Type.STRUCT, this.assets.length);
    for (var iter39 in this.assets)
    {
      if (this.assets.hasOwnProperty(iter39))
      {
        iter39 = this.assets[iter39];
        iter39.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  if (this.weight !== null && this.weight !== undefined) {
    output.writeFieldBegin('weight', Thrift.Type.I16, 3);
    output.writeI16(this.weight);
    output.writeFieldEnd();
  }
  if (this.revealText !== null && this.revealText !== undefined) {
    output.writeFieldBegin('revealText', Thrift.Type.STRING, 4);
    output.writeString(this.revealText);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

contentatom.quiz.Asset = module.exports.Asset = function(args) {
  this.type = null;
  this.data = null;
  if (args) {
    if (args.type !== undefined) {
      this.type = args.type;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field type is unset!');
    }
    if (args.data !== undefined) {
      this.data = args.data;
    } else {
      throw new Thrift.TProtocolException(Thrift.TProtocolExceptionType.UNKNOWN, 'Required field data is unset!');
    }
  }
};
contentatom.quiz.Asset.prototype = {};
contentatom.quiz.Asset.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRING) {
        this.type = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.data = input.readString();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

contentatom.quiz.Asset.prototype.write = function(output) {
  output.writeStructBegin('Asset');
  if (this.type !== null && this.type !== undefined) {
    output.writeFieldBegin('type', Thrift.Type.STRING, 1);
    output.writeString(this.type);
    output.writeFieldEnd();
  }
  if (this.data !== null && this.data !== undefined) {
    output.writeFieldBegin('data', Thrift.Type.STRING, 2);
    output.writeString(this.data);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

