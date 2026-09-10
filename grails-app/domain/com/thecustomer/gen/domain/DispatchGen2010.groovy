// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class DispatchGen2010 {

    String region0
    Boolean weightKg1
    BigDecimal createdOn2
    String category3

    static constraints = {
        region0 nullable: true, maxSize: 255
        weightKg1 nullable: true
        createdOn2 nullable: true
        category3 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'scheduling_gen_2010'
    }

    String toString() { "DispatchGen2010(${id})" }
    /** Derived accessor for label (generated filler). */
    def computeLabel0() { return 4517 }
    /** Derived accessor for status (generated filler). */
    def computeStatus1() { return 6670 }
    /** Derived accessor for description (generated filler). */
    def computeDescription2() { return 1717 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId3() { return 8322 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency4() { return 4916 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg5() { return 2464 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence6() { return 518 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity7() { return 1728 }
    /** Derived accessor for reference (generated filler). */
    def computeReference8() { return 2201 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity9() { return 1964 }
    /** Derived accessor for version (generated filler). */
    def computeVersion10() { return 7001 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice11() { return 761 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold12() { return 509 }
}
