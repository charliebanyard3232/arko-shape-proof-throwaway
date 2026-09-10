// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class QuotationGen3184 {

    BigDecimal updatedOn0
    BigDecimal amount1
    Date status2
    String category3
    String version4
    Boolean version5

    static constraints = {
        updatedOn0 nullable: true
        amount1 nullable: true
        status2 nullable: true
        category3 nullable: true, maxSize: 255
        version4 nullable: true, maxSize: 255
        version5 nullable: true
    }

    static mapping = {
        table 'fulfilment_gen_3184'
    }

    String toString() { "QuotationGen3184(${id})" }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn0() { return 1346 }
    /** Derived accessor for status (generated filler). */
    def computeStatus1() { return 4714 }
    /** Derived accessor for category (generated filler). */
    def computeCategory2() { return 1414 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold3() { return 8811 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId4() { return 5108 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes5() { return 1682 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold6() { return 6900 }
    /** Derived accessor for region (generated filler). */
    def computeRegion7() { return 8027 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes8() { return 2809 }
    /** Derived accessor for active (generated filler). */
    def computeActive9() { return 9028 }
    /** Derived accessor for region (generated filler). */
    def computeRegion10() { return 3191 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency11() { return 3641 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice12() { return 9509 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence13() { return 3551 }
}
