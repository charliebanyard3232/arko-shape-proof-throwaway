// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class RouteGen3002 {

    String weightKg0
    Integer createdOn1
    Date notes2
    Date updatedOn3
    Boolean threshold4
    String weightKg5
    Date priority6
    String reference7

    static constraints = {
        weightKg0 nullable: true, maxSize: 255
        createdOn1 nullable: true
        notes2 nullable: true
        updatedOn3 nullable: true
        threshold4 nullable: true
        weightKg5 nullable: true, maxSize: 255
        priority6 nullable: true
        reference7 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'returns_gen_3002'
    }

    String toString() { "RouteGen3002(${id})" }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 2503 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 5258 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity2() { return 3014 }
    /** Derived accessor for reference (generated filler). */
    def computeReference3() { return 2068 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 1281 }
    /** Derived accessor for status (generated filler). */
    def computeStatus5() { return 2393 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder6() { return 7687 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 876 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence8() { return 6590 }
    /** Derived accessor for status (generated filler). */
    def computeStatus9() { return 9389 }
}
