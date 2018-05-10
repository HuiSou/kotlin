/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package test.numbers

import kotlin.test.*


class CompanionIntrinsicObjectsJVMTest {
    @Test fun intTest() {
        val i = Int
        i.MAX_VALUE

        assertEquals(java.lang.Integer.MAX_VALUE, Int.MAX_VALUE)
        assertEquals(java.lang.Integer.MIN_VALUE, Int.MIN_VALUE)
    }

    @Test fun doubleTest() {
        val d = Double
        d.NaN

        assertEquals(java.lang.Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY)
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY)
        assertEquals(java.lang.Double.NaN, Double.NaN)

        assertEquals(java.lang.Double.MAX_VALUE, Double.MAX_VALUE)
        assertEquals(java.lang.Double.MIN_VALUE, Double.MIN_VALUE)
    }

    @Test fun floatTest() {
        val f = Float
        f.NEGATIVE_INFINITY

        assertEquals(java.lang.Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
        assertEquals(java.lang.Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY)
        assertEquals(java.lang.Float.NaN, Float.NaN)

        assertEquals(java.lang.Float.MAX_VALUE, Float.MAX_VALUE)
        assertEquals(java.lang.Float.MIN_VALUE, Float.MIN_VALUE)
    }

    @Test fun longTest() {
        val l = Long
        l.MAX_VALUE

        assertEquals(java.lang.Long.MAX_VALUE, Long.MAX_VALUE)
        assertEquals(java.lang.Long.MIN_VALUE, Long.MIN_VALUE)
    }

    @Test fun shortTest() {
        val s = Short
        s.MIN_VALUE

        assertEquals(java.lang.Short.MAX_VALUE, Short.MAX_VALUE)
        assertEquals(java.lang.Short.MIN_VALUE, Short.MIN_VALUE)
    }

    @Test fun byteTest() {
        val b = Byte
        b.MAX_VALUE

        assertEquals(java.lang.Byte.MAX_VALUE, Byte.MAX_VALUE)
        assertEquals(java.lang.Byte.MIN_VALUE, Byte.MIN_VALUE)
    }

    @Test fun charTest() {
        val ch = Char
        ch.MIN_SURROGATE

        assertEquals(ch, Char)
    }

    @Test fun stringTest() {
        val s = String
        s.CASE_INSENSITIVE_ORDER

        assertEquals(s, String)
    }
}