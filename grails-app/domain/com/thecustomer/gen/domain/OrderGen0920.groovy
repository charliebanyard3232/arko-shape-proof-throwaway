// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class OrderGen0920 {

    Integer externalId0
    Integer sequence1
    Date active2
    Date amount3
    String code4
    Date active5
    Boolean notes6

    static constraints = {
        externalId0 nullable: true
        sequence1 nullable: true
        active2 nullable: true
        amount3 nullable: true
        code4 nullable: true, maxSize: 255
        active5 nullable: true
        notes6 nullable: true
    }

    static mapping = {
        table 'catalogue_gen_0920'
    }

    String toString() { "OrderGen0920(${id})" }
    /** Derived accessor for label (generated filler). */
    def computeLabel0() { return 8373 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity1() { return 882 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold2() { return 1905 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 4334 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage4() { return 6103 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 3799 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity6() { return 1495 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence7() { return 4083 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 2830 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder9() { return 5223 }
    /** Derived accessor for priority (generated filler). */
}
