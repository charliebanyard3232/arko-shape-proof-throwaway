// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ApprovalGen1842 {

    Date createdOn0
    BigDecimal category1
    BigDecimal quantity2
    Boolean percentage3
    Date sequence4
    Integer status5
    BigDecimal sequence6
    String active7
    BigDecimal label8

    static constraints = {
        createdOn0 nullable: true
        category1 nullable: true
        quantity2 nullable: true
        percentage3 nullable: true
        sequence4 nullable: true
        status5 nullable: true
        sequence6 nullable: true
        active7 nullable: true, maxSize: 255
        label8 nullable: true
    }

    static mapping = {
        table 'reference_gen_1842'
    }

    String toString() { "ApprovalGen1842(${id})" }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence0() { return 2985 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold1() { return 2534 }
    /** Derived accessor for category (generated filler). */
    def computeCategory2() { return 3009 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity3() { return 8775 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold4() { return 3538 }
    /** Derived accessor for category (generated filler). */
    def computeCategory5() { return 3590 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg6() { return 1839 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId7() { return 854 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName8() { return 2467 }
    /** Derived accessor for region (generated filler). */
    def computeRegion9() { return 6637 }
    /** Derived accessor for region (generated filler). */
    def computeRegion10() { return 4697 }
    /** Derived accessor for updatedOn (generated filler). */
}
