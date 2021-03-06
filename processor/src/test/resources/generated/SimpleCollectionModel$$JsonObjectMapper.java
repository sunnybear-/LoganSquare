package com.bluelinelabs.logansquare.processor;

import com.bluelinelabs.logansquare.JsonMapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class SimpleCollectionModel$$JsonObjectMapper extends JsonMapper<SimpleCollectionModel> {
    @Override
    public SimpleCollectionModel parse(JsonParser jsonParser) throws IOException {
        return _parse(jsonParser);
    }

    public static SimpleCollectionModel _parse(JsonParser jsonParser) throws IOException {
        SimpleCollectionModel instance = new SimpleCollectionModel();
        if (jsonParser.getCurrentToken() == null) {
            jsonParser.nextToken();
        }
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String fieldName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            parseField(instance, fieldName, jsonParser);
            jsonParser.skipChildren();
        }
        return instance;
    }

    public static void parseField(SimpleCollectionModel instance, String fieldName, JsonParser jsonParser) throws IOException {
        if ("model_array".equals(fieldName)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                List<SimpleCollectionModel.ModelForCollection> collection1 = new ArrayList<SimpleCollectionModel.ModelForCollection>();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    SimpleCollectionModel.ModelForCollection value1;
                    value1 = SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._parse(jsonParser);
                    if (value1 != null) {
                        collection1.add(value1);
                    }
                }
                SimpleCollectionModel.ModelForCollection[] array = collection1.toArray(new SimpleCollectionModel.ModelForCollection[collection1.size()]);
                instance.modelForCollectionArray = array;
            } else {
                instance.modelForCollectionArray = null;
            }
        } else if ("model_deque".equals(fieldName)){
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                ArrayDeque<SimpleCollectionModel.ModelForCollection> collection1 = new ArrayDeque<SimpleCollectionModel.ModelForCollection>();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    SimpleCollectionModel.ModelForCollection value1;
                    value1 = SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._parse(jsonParser);
                    if (value1 != null) {
                        collection1.add(value1);
                    }
                }
                instance.modelForCollectionDeque = collection1;
            } else{
                instance.modelForCollectionDeque = null;
            }
        } else if ("model_list".equals(fieldName)){
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                ArrayList<SimpleCollectionModel.ModelForCollection> collection1 = new ArrayList<SimpleCollectionModel.ModelForCollection>();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    SimpleCollectionModel.ModelForCollection value1;
                    value1 = SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._parse(jsonParser);
                    if (value1 != null) {
                        collection1.add(value1);
                    }
                }
                instance.modelForCollectionList = collection1;
            } else{
                instance.modelForCollectionList = null;
            }
        } else if ("model_map".equals(fieldName)){
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                HashMap<String, SimpleCollectionModel.ModelForCollection> map1 = new HashMap<String, SimpleCollectionModel.ModelForCollection>();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    String key1 = jsonParser.getText();
                    jsonParser.nextToken();
                    if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                        map1.put(key1, null);
                    } else{
                        map1.put(key1, SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._parse(jsonParser));
                    }
                }
                instance.modelForCollectionMap = map1;
            } else{
                instance.modelForCollectionMap = null;
            }
        } else if ("model_queue".equals(fieldName)){
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                ArrayDeque<SimpleCollectionModel.ModelForCollection> collection1 = new ArrayDeque<SimpleCollectionModel.ModelForCollection>();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    SimpleCollectionModel.ModelForCollection value1;
                    value1 = SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._parse(jsonParser);
                    if (value1 != null) {
                        collection1.add(value1);
                    }
                }
                instance.modelForCollectionQueue = collection1;
            } else{
                instance.modelForCollectionQueue = null;
            }
        } else if ("model_set".equals(fieldName)){
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                HashSet<SimpleCollectionModel.ModelForCollection> collection1 = new HashSet<SimpleCollectionModel.ModelForCollection>();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    SimpleCollectionModel.ModelForCollection value1;
                    value1 = SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._parse(jsonParser);
                    if (value1 != null) {
                        collection1.add(value1);
                    }
                }
                instance.modelForCollectionSet = collection1;
            } else{
                instance.modelForCollectionSet = null;
            }
        } else if ("primitive_array".equals(fieldName)){
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                List<Integer> collection1 = new ArrayList<Integer>();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    collection1.add(jsonParser.getValueAsInt());
                }
                int[] array = new int[collection1.size()];
                int i = 0;
                for (int value : collection1) {
                    array[i++] = value;
                }
                instance.primitiveArray = array;
            } else {
                instance.primitiveArray = null;
            }
        }
    }

    @Override
    public void serialize(SimpleCollectionModel object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
        _serialize(object, jsonGenerator, writeStartAndEnd);
    }

    public static void _serialize(SimpleCollectionModel object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
        if (writeStartAndEnd) {
            jsonGenerator.writeStartObject();
        }
        final SimpleCollectionModel.ModelForCollection[] lslocalmodel_array = object.modelForCollectionArray;
        if (lslocalmodel_array != null) {
            jsonGenerator.writeFieldName("model_array");
            jsonGenerator.writeStartArray();
            for (SimpleCollectionModel.ModelForCollection element1 : lslocalmodel_array) {
                if (element1 != null) {
                    SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._serialize(element1, jsonGenerator, true);
                }
            }
            jsonGenerator.writeEndArray();
        }
        final Queue<SimpleCollectionModel.ModelForCollection> lslocalmodel_deque = object.modelForCollectionDeque;
        if (lslocalmodel_deque != null) {
            jsonGenerator.writeFieldName("model_deque");
            jsonGenerator.writeStartArray();
            for (SimpleCollectionModel.ModelForCollection element1 : lslocalmodel_deque) {
                if (element1 != null) {
                    SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._serialize(element1, jsonGenerator, true);
                }
            }
            jsonGenerator.writeEndArray();
        }
        final List<SimpleCollectionModel.ModelForCollection> lslocalmodel_list = object.modelForCollectionList;
        if (lslocalmodel_list != null) {
            jsonGenerator.writeFieldName("model_list");
            jsonGenerator.writeStartArray();
            for (SimpleCollectionModel.ModelForCollection element1 : lslocalmodel_list) {
                if (element1 != null) {
                    SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._serialize(element1, jsonGenerator, true);
                }
            }
            jsonGenerator.writeEndArray();
        }
        final Map<String, SimpleCollectionModel.ModelForCollection> lslocalmodel_map = object.modelForCollectionMap;
        if (lslocalmodel_map != null) {
            jsonGenerator.writeFieldName("model_map");
            jsonGenerator.writeStartObject();
            for (Map.Entry<String, SimpleCollectionModel.ModelForCollection> entry1 : lslocalmodel_map.entrySet()) {
                jsonGenerator.writeFieldName(entry1.getKey().toString());
                if (entry1.getValue() == null) {
                    jsonGenerator.writeNull();
                } else{
                    if (entry1.getValue() != null) {
                        SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._serialize(entry1.getValue(), jsonGenerator, true);
                    }
                }
            }
            jsonGenerator.writeEndObject();
        }
        final Queue<SimpleCollectionModel.ModelForCollection> lslocalmodel_queue = object.modelForCollectionQueue;
        if (lslocalmodel_queue != null) {
            jsonGenerator.writeFieldName("model_queue");
            jsonGenerator.writeStartArray();
            for (SimpleCollectionModel.ModelForCollection element1 : lslocalmodel_queue) {
                if (element1 != null) {
                    SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._serialize(element1, jsonGenerator, true);
                }
            }
            jsonGenerator.writeEndArray();
        }
        final Set<SimpleCollectionModel.ModelForCollection> lslocalmodel_set = object.modelForCollectionSet;
        if (lslocalmodel_set != null) {
            jsonGenerator.writeFieldName("model_set");
            jsonGenerator.writeStartArray();
            for (SimpleCollectionModel.ModelForCollection element1 : lslocalmodel_set) {
                if (element1 != null) {
                    SimpleCollectionModel$ModelForCollection$$JsonObjectMapper._serialize(element1, jsonGenerator, true);
                }
            }
            jsonGenerator.writeEndArray();
        }
        final int[] lslocalprimitive_array = object.primitiveArray;
        if (lslocalprimitive_array != null) {
            jsonGenerator.writeFieldName("primitive_array");
            jsonGenerator.writeStartArray();
            for (int element1 : lslocalprimitive_array) {
                jsonGenerator.writeNumber(element1);
            }
            jsonGenerator.writeEndArray();
        }
        if (writeStartAndEnd) {
            jsonGenerator.writeEndObject();
        }
    }
}