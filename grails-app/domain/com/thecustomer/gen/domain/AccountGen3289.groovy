// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class AccountGen3289 {

    Boolean sequence0
    String category1
    String weightKg2
    Boolean sequence3
    Boolean status4
    String version5
    String externalId6
    String sortOrder7

    static constraints = {
        sequence0 nullable: true
        category1 nullable: true, maxSize: 255
        weightKg2 nullable: true, maxSize: 255
        sequence3 nullable: true
        status4 nullable: true
        version5 nullable: true, maxSize: 255
        externalId6 nullable: true, maxSize: 255
        sortOrder7 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'settlement_gen_3289'
    }

    String toString() { "AccountGen3289(${id})" }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice0() { return 4776 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes1() { return 3791 }
    /** Derived accessor for description (generated filler). */
    def computeDescription2() { return 3990 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 8078 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence4() { return 9837 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 3823 }
    /** Derived accessor for label (generated filler). */
    def computeLabel6() { return 423 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount7() { return 2527 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold8() { return 6494 }
    /** Derived accessor for active (generated filler). */
}
