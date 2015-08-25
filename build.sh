#!/bin/bash

LANGUAGES=("js:node" "java")

THRIFT_VERBOSE="-v"

while getopts "q" OPT
do
  case $OPT in
    "q") THRIFT_VERBOSE=""
      ;;
    "v") THRIFT_VERBOSE="-v"
      ;;
  esac
done

THRIFT_DIR="thrift"
: ${THRIFT_CMD:=$(which thrift)}

THRIFT_FILE="$THRIFT_DIR/contentatom.thrift"

function fatal {
    echo >&2 $@
    exit 1
}

if [[ ! -x "${THRIFT_CMD}" ]]
then
    fatal "ERROR: Cannot find thrift. Either install it in the path or set variable" \
          "THRIFT_CMD to its location. (See https://thrift.apache.org/download)"
fi


LANG_OPTS=${LANGUAGES[@]/#/--gen }

$THRIFT_CMD $THRIFT_VERBOSE --recurse -o ${THRIFT_DIR} $LANG_OPTS "$THRIFT_FILE"
