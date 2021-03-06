package com.mangofactory.swagger;

import com.wordnik.swagger.model.Model;
import scala.None;
import scala.Option;
import scala.Predef;
import scala.Predef$;
import scala.Tuple2;
import scala.collection.Map;
import scala.collection.immutable.List;
import scala.collection.mutable.WrappedArray;

import java.util.ArrayList;
import java.util.Collection;

import static scala.collection.JavaConversions.collectionAsScalaIterable;
import static scala.collection.JavaConversions.mapAsJavaMap;
import static scala.collection.JavaConversions.seqAsJavaList;

public class ScalaUtils {

  public static List toScalaList(Collection collection) {
    if (null == collection) {
      collection = new ArrayList();
    }
    return collectionAsScalaIterable(collection).toList();
  }

  public static List emptyScalaList() {
    return collectionAsScalaIterable(new ArrayList()).toList();
  }

  public static java.util.List<?> fromScalaList(List<?> list) {
    return seqAsJavaList(list);
  }

  public static java.util.List<?> fromScalaList(None none) {
    return null;
  }

  public static Option toOption(Object o) {
    return Option.apply(o);
  }

  public static <T> T fromOption(Option<T> o) {
    if (!o.isDefined()) {
      return null;
    }
    return o.get();
  }

  public static java.util.Map fromScalaMap(Map map) {
    return mapAsJavaMap(map);
  }


  public static Map<String, Model> toScalaModelMap(java.util.Map<String, Model> map){
    if(null!= map){
      final Tuple2[] ts = new Tuple2[map.size()];
      int i = 0;
      for(java.util.Map.Entry<String, Model> entry : map.entrySet()){
        ts[i] = new Tuple2(entry.getKey(), entry.getValue());
        i ++;
      }
      final WrappedArray wa = Predef.wrapRefArray(ts);
      return (Map<String, Model>) Predef$.MODULE$.Map().apply(wa);
    }
    return null;
  }
}
