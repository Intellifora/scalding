/*
Copyright 2012 Twitter, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.twitter.scalding.serialization

import java.io.Serializable

import com.esotericsoftware.kryo.Kryo
import com.esotericsoftware.kryo.{Serializer => KSerializer}
import com.esotericsoftware.kryo.io.{Input, Output}

// DO NOT EDIT: auto generated by tuple_serializers.scala at: 2012/09/17 11:45:12 -0700
// scala tuple_serializers.scala > ../src/main/scala/com/twitter/scalding/serialization/TupleSerializers.scala

class Tuple1Serializer[A] extends KSerializer[Tuple1[A]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple1[A]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple1[A]]) : Tuple1[A] = {
    new Tuple1[A](
      kser.readClassAndObject(in).asInstanceOf[A]
    )
  }
}
class Tuple2Serializer[A,B] extends KSerializer[Tuple2[A,B]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple2[A,B]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple2[A,B]]) : Tuple2[A,B] = {
    new Tuple2[A,B](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B]
    )
  }
}
class Tuple3Serializer[A,B,C] extends KSerializer[Tuple3[A,B,C]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple3[A,B,C]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple3[A,B,C]]) : Tuple3[A,B,C] = {
    new Tuple3[A,B,C](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C]
    )
  }
}
class Tuple4Serializer[A,B,C,D] extends KSerializer[Tuple4[A,B,C,D]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple4[A,B,C,D]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple4[A,B,C,D]]) : Tuple4[A,B,C,D] = {
    new Tuple4[A,B,C,D](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D]
    )
  }
}
class Tuple5Serializer[A,B,C,D,E] extends KSerializer[Tuple5[A,B,C,D,E]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple5[A,B,C,D,E]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple5[A,B,C,D,E]]) : Tuple5[A,B,C,D,E] = {
    new Tuple5[A,B,C,D,E](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E]
    )
  }
}
class Tuple6Serializer[A,B,C,D,E,F] extends KSerializer[Tuple6[A,B,C,D,E,F]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple6[A,B,C,D,E,F]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple6[A,B,C,D,E,F]]) : Tuple6[A,B,C,D,E,F] = {
    new Tuple6[A,B,C,D,E,F](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F]
    )
  }
}
class Tuple7Serializer[A,B,C,D,E,F,G] extends KSerializer[Tuple7[A,B,C,D,E,F,G]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple7[A,B,C,D,E,F,G]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple7[A,B,C,D,E,F,G]]) : Tuple7[A,B,C,D,E,F,G] = {
    new Tuple7[A,B,C,D,E,F,G](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G]
    )
  }
}
class Tuple8Serializer[A,B,C,D,E,F,G,H] extends KSerializer[Tuple8[A,B,C,D,E,F,G,H]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple8[A,B,C,D,E,F,G,H]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
    kser.writeClassAndObject(out, obj._8); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple8[A,B,C,D,E,F,G,H]]) : Tuple8[A,B,C,D,E,F,G,H] = {
    new Tuple8[A,B,C,D,E,F,G,H](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G],
      kser.readClassAndObject(in).asInstanceOf[H]
    )
  }
}
class Tuple9Serializer[A,B,C,D,E,F,G,H,I] extends KSerializer[Tuple9[A,B,C,D,E,F,G,H,I]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple9[A,B,C,D,E,F,G,H,I]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
    kser.writeClassAndObject(out, obj._8); out.flush;
    kser.writeClassAndObject(out, obj._9); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple9[A,B,C,D,E,F,G,H,I]]) : Tuple9[A,B,C,D,E,F,G,H,I] = {
    new Tuple9[A,B,C,D,E,F,G,H,I](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G],
      kser.readClassAndObject(in).asInstanceOf[H],
      kser.readClassAndObject(in).asInstanceOf[I]
    )
  }
}
class Tuple10Serializer[A,B,C,D,E,F,G,H,I,J] extends KSerializer[Tuple10[A,B,C,D,E,F,G,H,I,J]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple10[A,B,C,D,E,F,G,H,I,J]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
    kser.writeClassAndObject(out, obj._8); out.flush;
    kser.writeClassAndObject(out, obj._9); out.flush;
    kser.writeClassAndObject(out, obj._10); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple10[A,B,C,D,E,F,G,H,I,J]]) : Tuple10[A,B,C,D,E,F,G,H,I,J] = {
    new Tuple10[A,B,C,D,E,F,G,H,I,J](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G],
      kser.readClassAndObject(in).asInstanceOf[H],
      kser.readClassAndObject(in).asInstanceOf[I],
      kser.readClassAndObject(in).asInstanceOf[J]
    )
  }
}
class Tuple11Serializer[A,B,C,D,E,F,G,H,I,J,K] extends KSerializer[Tuple11[A,B,C,D,E,F,G,H,I,J,K]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple11[A,B,C,D,E,F,G,H,I,J,K]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
    kser.writeClassAndObject(out, obj._8); out.flush;
    kser.writeClassAndObject(out, obj._9); out.flush;
    kser.writeClassAndObject(out, obj._10); out.flush;
    kser.writeClassAndObject(out, obj._11); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple11[A,B,C,D,E,F,G,H,I,J,K]]) : Tuple11[A,B,C,D,E,F,G,H,I,J,K] = {
    new Tuple11[A,B,C,D,E,F,G,H,I,J,K](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G],
      kser.readClassAndObject(in).asInstanceOf[H],
      kser.readClassAndObject(in).asInstanceOf[I],
      kser.readClassAndObject(in).asInstanceOf[J],
      kser.readClassAndObject(in).asInstanceOf[K]
    )
  }
}
class Tuple12Serializer[A,B,C,D,E,F,G,H,I,J,K,L] extends KSerializer[Tuple12[A,B,C,D,E,F,G,H,I,J,K,L]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple12[A,B,C,D,E,F,G,H,I,J,K,L]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
    kser.writeClassAndObject(out, obj._8); out.flush;
    kser.writeClassAndObject(out, obj._9); out.flush;
    kser.writeClassAndObject(out, obj._10); out.flush;
    kser.writeClassAndObject(out, obj._11); out.flush;
    kser.writeClassAndObject(out, obj._12); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple12[A,B,C,D,E,F,G,H,I,J,K,L]]) : Tuple12[A,B,C,D,E,F,G,H,I,J,K,L] = {
    new Tuple12[A,B,C,D,E,F,G,H,I,J,K,L](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G],
      kser.readClassAndObject(in).asInstanceOf[H],
      kser.readClassAndObject(in).asInstanceOf[I],
      kser.readClassAndObject(in).asInstanceOf[J],
      kser.readClassAndObject(in).asInstanceOf[K],
      kser.readClassAndObject(in).asInstanceOf[L]
    )
  }
}
class Tuple13Serializer[A,B,C,D,E,F,G,H,I,J,K,L,M] extends KSerializer[Tuple13[A,B,C,D,E,F,G,H,I,J,K,L,M]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple13[A,B,C,D,E,F,G,H,I,J,K,L,M]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
    kser.writeClassAndObject(out, obj._8); out.flush;
    kser.writeClassAndObject(out, obj._9); out.flush;
    kser.writeClassAndObject(out, obj._10); out.flush;
    kser.writeClassAndObject(out, obj._11); out.flush;
    kser.writeClassAndObject(out, obj._12); out.flush;
    kser.writeClassAndObject(out, obj._13); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple13[A,B,C,D,E,F,G,H,I,J,K,L,M]]) : Tuple13[A,B,C,D,E,F,G,H,I,J,K,L,M] = {
    new Tuple13[A,B,C,D,E,F,G,H,I,J,K,L,M](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G],
      kser.readClassAndObject(in).asInstanceOf[H],
      kser.readClassAndObject(in).asInstanceOf[I],
      kser.readClassAndObject(in).asInstanceOf[J],
      kser.readClassAndObject(in).asInstanceOf[K],
      kser.readClassAndObject(in).asInstanceOf[L],
      kser.readClassAndObject(in).asInstanceOf[M]
    )
  }
}
class Tuple14Serializer[A,B,C,D,E,F,G,H,I,J,K,L,M,N] extends KSerializer[Tuple14[A,B,C,D,E,F,G,H,I,J,K,L,M,N]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple14[A,B,C,D,E,F,G,H,I,J,K,L,M,N]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
    kser.writeClassAndObject(out, obj._8); out.flush;
    kser.writeClassAndObject(out, obj._9); out.flush;
    kser.writeClassAndObject(out, obj._10); out.flush;
    kser.writeClassAndObject(out, obj._11); out.flush;
    kser.writeClassAndObject(out, obj._12); out.flush;
    kser.writeClassAndObject(out, obj._13); out.flush;
    kser.writeClassAndObject(out, obj._14); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple14[A,B,C,D,E,F,G,H,I,J,K,L,M,N]]) : Tuple14[A,B,C,D,E,F,G,H,I,J,K,L,M,N] = {
    new Tuple14[A,B,C,D,E,F,G,H,I,J,K,L,M,N](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G],
      kser.readClassAndObject(in).asInstanceOf[H],
      kser.readClassAndObject(in).asInstanceOf[I],
      kser.readClassAndObject(in).asInstanceOf[J],
      kser.readClassAndObject(in).asInstanceOf[K],
      kser.readClassAndObject(in).asInstanceOf[L],
      kser.readClassAndObject(in).asInstanceOf[M],
      kser.readClassAndObject(in).asInstanceOf[N]
    )
  }
}
class Tuple15Serializer[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O] extends KSerializer[Tuple15[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple15[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
    kser.writeClassAndObject(out, obj._8); out.flush;
    kser.writeClassAndObject(out, obj._9); out.flush;
    kser.writeClassAndObject(out, obj._10); out.flush;
    kser.writeClassAndObject(out, obj._11); out.flush;
    kser.writeClassAndObject(out, obj._12); out.flush;
    kser.writeClassAndObject(out, obj._13); out.flush;
    kser.writeClassAndObject(out, obj._14); out.flush;
    kser.writeClassAndObject(out, obj._15); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple15[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O]]) : Tuple15[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O] = {
    new Tuple15[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G],
      kser.readClassAndObject(in).asInstanceOf[H],
      kser.readClassAndObject(in).asInstanceOf[I],
      kser.readClassAndObject(in).asInstanceOf[J],
      kser.readClassAndObject(in).asInstanceOf[K],
      kser.readClassAndObject(in).asInstanceOf[L],
      kser.readClassAndObject(in).asInstanceOf[M],
      kser.readClassAndObject(in).asInstanceOf[N],
      kser.readClassAndObject(in).asInstanceOf[O]
    )
  }
}
class Tuple16Serializer[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P] extends KSerializer[Tuple16[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple16[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
    kser.writeClassAndObject(out, obj._8); out.flush;
    kser.writeClassAndObject(out, obj._9); out.flush;
    kser.writeClassAndObject(out, obj._10); out.flush;
    kser.writeClassAndObject(out, obj._11); out.flush;
    kser.writeClassAndObject(out, obj._12); out.flush;
    kser.writeClassAndObject(out, obj._13); out.flush;
    kser.writeClassAndObject(out, obj._14); out.flush;
    kser.writeClassAndObject(out, obj._15); out.flush;
    kser.writeClassAndObject(out, obj._16); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple16[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P]]) : Tuple16[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P] = {
    new Tuple16[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G],
      kser.readClassAndObject(in).asInstanceOf[H],
      kser.readClassAndObject(in).asInstanceOf[I],
      kser.readClassAndObject(in).asInstanceOf[J],
      kser.readClassAndObject(in).asInstanceOf[K],
      kser.readClassAndObject(in).asInstanceOf[L],
      kser.readClassAndObject(in).asInstanceOf[M],
      kser.readClassAndObject(in).asInstanceOf[N],
      kser.readClassAndObject(in).asInstanceOf[O],
      kser.readClassAndObject(in).asInstanceOf[P]
    )
  }
}
class Tuple17Serializer[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q] extends KSerializer[Tuple17[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple17[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
    kser.writeClassAndObject(out, obj._8); out.flush;
    kser.writeClassAndObject(out, obj._9); out.flush;
    kser.writeClassAndObject(out, obj._10); out.flush;
    kser.writeClassAndObject(out, obj._11); out.flush;
    kser.writeClassAndObject(out, obj._12); out.flush;
    kser.writeClassAndObject(out, obj._13); out.flush;
    kser.writeClassAndObject(out, obj._14); out.flush;
    kser.writeClassAndObject(out, obj._15); out.flush;
    kser.writeClassAndObject(out, obj._16); out.flush;
    kser.writeClassAndObject(out, obj._17); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple17[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q]]) : Tuple17[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q] = {
    new Tuple17[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G],
      kser.readClassAndObject(in).asInstanceOf[H],
      kser.readClassAndObject(in).asInstanceOf[I],
      kser.readClassAndObject(in).asInstanceOf[J],
      kser.readClassAndObject(in).asInstanceOf[K],
      kser.readClassAndObject(in).asInstanceOf[L],
      kser.readClassAndObject(in).asInstanceOf[M],
      kser.readClassAndObject(in).asInstanceOf[N],
      kser.readClassAndObject(in).asInstanceOf[O],
      kser.readClassAndObject(in).asInstanceOf[P],
      kser.readClassAndObject(in).asInstanceOf[Q]
    )
  }
}
class Tuple18Serializer[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R] extends KSerializer[Tuple18[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple18[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
    kser.writeClassAndObject(out, obj._8); out.flush;
    kser.writeClassAndObject(out, obj._9); out.flush;
    kser.writeClassAndObject(out, obj._10); out.flush;
    kser.writeClassAndObject(out, obj._11); out.flush;
    kser.writeClassAndObject(out, obj._12); out.flush;
    kser.writeClassAndObject(out, obj._13); out.flush;
    kser.writeClassAndObject(out, obj._14); out.flush;
    kser.writeClassAndObject(out, obj._15); out.flush;
    kser.writeClassAndObject(out, obj._16); out.flush;
    kser.writeClassAndObject(out, obj._17); out.flush;
    kser.writeClassAndObject(out, obj._18); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple18[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R]]) : Tuple18[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R] = {
    new Tuple18[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G],
      kser.readClassAndObject(in).asInstanceOf[H],
      kser.readClassAndObject(in).asInstanceOf[I],
      kser.readClassAndObject(in).asInstanceOf[J],
      kser.readClassAndObject(in).asInstanceOf[K],
      kser.readClassAndObject(in).asInstanceOf[L],
      kser.readClassAndObject(in).asInstanceOf[M],
      kser.readClassAndObject(in).asInstanceOf[N],
      kser.readClassAndObject(in).asInstanceOf[O],
      kser.readClassAndObject(in).asInstanceOf[P],
      kser.readClassAndObject(in).asInstanceOf[Q],
      kser.readClassAndObject(in).asInstanceOf[R]
    )
  }
}
class Tuple19Serializer[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S] extends KSerializer[Tuple19[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple19[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
    kser.writeClassAndObject(out, obj._8); out.flush;
    kser.writeClassAndObject(out, obj._9); out.flush;
    kser.writeClassAndObject(out, obj._10); out.flush;
    kser.writeClassAndObject(out, obj._11); out.flush;
    kser.writeClassAndObject(out, obj._12); out.flush;
    kser.writeClassAndObject(out, obj._13); out.flush;
    kser.writeClassAndObject(out, obj._14); out.flush;
    kser.writeClassAndObject(out, obj._15); out.flush;
    kser.writeClassAndObject(out, obj._16); out.flush;
    kser.writeClassAndObject(out, obj._17); out.flush;
    kser.writeClassAndObject(out, obj._18); out.flush;
    kser.writeClassAndObject(out, obj._19); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple19[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S]]) : Tuple19[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S] = {
    new Tuple19[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G],
      kser.readClassAndObject(in).asInstanceOf[H],
      kser.readClassAndObject(in).asInstanceOf[I],
      kser.readClassAndObject(in).asInstanceOf[J],
      kser.readClassAndObject(in).asInstanceOf[K],
      kser.readClassAndObject(in).asInstanceOf[L],
      kser.readClassAndObject(in).asInstanceOf[M],
      kser.readClassAndObject(in).asInstanceOf[N],
      kser.readClassAndObject(in).asInstanceOf[O],
      kser.readClassAndObject(in).asInstanceOf[P],
      kser.readClassAndObject(in).asInstanceOf[Q],
      kser.readClassAndObject(in).asInstanceOf[R],
      kser.readClassAndObject(in).asInstanceOf[S]
    )
  }
}
class Tuple20Serializer[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T] extends KSerializer[Tuple20[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple20[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
    kser.writeClassAndObject(out, obj._8); out.flush;
    kser.writeClassAndObject(out, obj._9); out.flush;
    kser.writeClassAndObject(out, obj._10); out.flush;
    kser.writeClassAndObject(out, obj._11); out.flush;
    kser.writeClassAndObject(out, obj._12); out.flush;
    kser.writeClassAndObject(out, obj._13); out.flush;
    kser.writeClassAndObject(out, obj._14); out.flush;
    kser.writeClassAndObject(out, obj._15); out.flush;
    kser.writeClassAndObject(out, obj._16); out.flush;
    kser.writeClassAndObject(out, obj._17); out.flush;
    kser.writeClassAndObject(out, obj._18); out.flush;
    kser.writeClassAndObject(out, obj._19); out.flush;
    kser.writeClassAndObject(out, obj._20); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple20[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T]]) : Tuple20[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T] = {
    new Tuple20[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G],
      kser.readClassAndObject(in).asInstanceOf[H],
      kser.readClassAndObject(in).asInstanceOf[I],
      kser.readClassAndObject(in).asInstanceOf[J],
      kser.readClassAndObject(in).asInstanceOf[K],
      kser.readClassAndObject(in).asInstanceOf[L],
      kser.readClassAndObject(in).asInstanceOf[M],
      kser.readClassAndObject(in).asInstanceOf[N],
      kser.readClassAndObject(in).asInstanceOf[O],
      kser.readClassAndObject(in).asInstanceOf[P],
      kser.readClassAndObject(in).asInstanceOf[Q],
      kser.readClassAndObject(in).asInstanceOf[R],
      kser.readClassAndObject(in).asInstanceOf[S],
      kser.readClassAndObject(in).asInstanceOf[T]
    )
  }
}
class Tuple21Serializer[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U] extends KSerializer[Tuple21[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple21[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
    kser.writeClassAndObject(out, obj._8); out.flush;
    kser.writeClassAndObject(out, obj._9); out.flush;
    kser.writeClassAndObject(out, obj._10); out.flush;
    kser.writeClassAndObject(out, obj._11); out.flush;
    kser.writeClassAndObject(out, obj._12); out.flush;
    kser.writeClassAndObject(out, obj._13); out.flush;
    kser.writeClassAndObject(out, obj._14); out.flush;
    kser.writeClassAndObject(out, obj._15); out.flush;
    kser.writeClassAndObject(out, obj._16); out.flush;
    kser.writeClassAndObject(out, obj._17); out.flush;
    kser.writeClassAndObject(out, obj._18); out.flush;
    kser.writeClassAndObject(out, obj._19); out.flush;
    kser.writeClassAndObject(out, obj._20); out.flush;
    kser.writeClassAndObject(out, obj._21); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple21[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U]]) : Tuple21[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U] = {
    new Tuple21[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G],
      kser.readClassAndObject(in).asInstanceOf[H],
      kser.readClassAndObject(in).asInstanceOf[I],
      kser.readClassAndObject(in).asInstanceOf[J],
      kser.readClassAndObject(in).asInstanceOf[K],
      kser.readClassAndObject(in).asInstanceOf[L],
      kser.readClassAndObject(in).asInstanceOf[M],
      kser.readClassAndObject(in).asInstanceOf[N],
      kser.readClassAndObject(in).asInstanceOf[O],
      kser.readClassAndObject(in).asInstanceOf[P],
      kser.readClassAndObject(in).asInstanceOf[Q],
      kser.readClassAndObject(in).asInstanceOf[R],
      kser.readClassAndObject(in).asInstanceOf[S],
      kser.readClassAndObject(in).asInstanceOf[T],
      kser.readClassAndObject(in).asInstanceOf[U]
    )
  }
}
class Tuple22Serializer[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V] extends KSerializer[Tuple22[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V]] with Serializable {
  setImmutable(true)
  def write(kser : Kryo, out : Output, obj : Tuple22[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V]) {
    kser.writeClassAndObject(out, obj._1); out.flush;
    kser.writeClassAndObject(out, obj._2); out.flush;
    kser.writeClassAndObject(out, obj._3); out.flush;
    kser.writeClassAndObject(out, obj._4); out.flush;
    kser.writeClassAndObject(out, obj._5); out.flush;
    kser.writeClassAndObject(out, obj._6); out.flush;
    kser.writeClassAndObject(out, obj._7); out.flush;
    kser.writeClassAndObject(out, obj._8); out.flush;
    kser.writeClassAndObject(out, obj._9); out.flush;
    kser.writeClassAndObject(out, obj._10); out.flush;
    kser.writeClassAndObject(out, obj._11); out.flush;
    kser.writeClassAndObject(out, obj._12); out.flush;
    kser.writeClassAndObject(out, obj._13); out.flush;
    kser.writeClassAndObject(out, obj._14); out.flush;
    kser.writeClassAndObject(out, obj._15); out.flush;
    kser.writeClassAndObject(out, obj._16); out.flush;
    kser.writeClassAndObject(out, obj._17); out.flush;
    kser.writeClassAndObject(out, obj._18); out.flush;
    kser.writeClassAndObject(out, obj._19); out.flush;
    kser.writeClassAndObject(out, obj._20); out.flush;
    kser.writeClassAndObject(out, obj._21); out.flush;
    kser.writeClassAndObject(out, obj._22); out.flush;
  }
  def read(kser : Kryo, in : Input, cls : Class[Tuple22[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V]]) : Tuple22[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V] = {
    new Tuple22[A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V](
      kser.readClassAndObject(in).asInstanceOf[A],
      kser.readClassAndObject(in).asInstanceOf[B],
      kser.readClassAndObject(in).asInstanceOf[C],
      kser.readClassAndObject(in).asInstanceOf[D],
      kser.readClassAndObject(in).asInstanceOf[E],
      kser.readClassAndObject(in).asInstanceOf[F],
      kser.readClassAndObject(in).asInstanceOf[G],
      kser.readClassAndObject(in).asInstanceOf[H],
      kser.readClassAndObject(in).asInstanceOf[I],
      kser.readClassAndObject(in).asInstanceOf[J],
      kser.readClassAndObject(in).asInstanceOf[K],
      kser.readClassAndObject(in).asInstanceOf[L],
      kser.readClassAndObject(in).asInstanceOf[M],
      kser.readClassAndObject(in).asInstanceOf[N],
      kser.readClassAndObject(in).asInstanceOf[O],
      kser.readClassAndObject(in).asInstanceOf[P],
      kser.readClassAndObject(in).asInstanceOf[Q],
      kser.readClassAndObject(in).asInstanceOf[R],
      kser.readClassAndObject(in).asInstanceOf[S],
      kser.readClassAndObject(in).asInstanceOf[T],
      kser.readClassAndObject(in).asInstanceOf[U],
      kser.readClassAndObject(in).asInstanceOf[V]
    )
  }
}
object ScalaTupleSerialization extends Serializable {
  def register(newK : Kryo) {

    newK.register(classOf[Tuple1[Any]], new Tuple1Serializer[Any])
    newK.register(classOf[Tuple2[Any,Any]], new Tuple2Serializer[Any,Any])
    newK.register(classOf[Tuple3[Any,Any,Any]], new Tuple3Serializer[Any,Any,Any])
    newK.register(classOf[Tuple4[Any,Any,Any,Any]], new Tuple4Serializer[Any,Any,Any,Any])
    newK.register(classOf[Tuple5[Any,Any,Any,Any,Any]], new Tuple5Serializer[Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple6[Any,Any,Any,Any,Any,Any]], new Tuple6Serializer[Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple7[Any,Any,Any,Any,Any,Any,Any]], new Tuple7Serializer[Any,Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple8[Any,Any,Any,Any,Any,Any,Any,Any]], new Tuple8Serializer[Any,Any,Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple9[Any,Any,Any,Any,Any,Any,Any,Any,Any]], new Tuple9Serializer[Any,Any,Any,Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple10[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any]], new Tuple10Serializer[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple11[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any]], new Tuple11Serializer[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple12[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any]], new Tuple12Serializer[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple13[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any]], new Tuple13Serializer[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple14[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any]], new Tuple14Serializer[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple15[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any]], new Tuple15Serializer[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple16[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any]], new Tuple16Serializer[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple17[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any]], new Tuple17Serializer[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple18[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any]], new Tuple18Serializer[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple19[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any]], new Tuple19Serializer[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple20[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any]], new Tuple20Serializer[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple21[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any]], new Tuple21Serializer[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any])
    newK.register(classOf[Tuple22[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any]], new Tuple22Serializer[Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any,Any])
  }
}
