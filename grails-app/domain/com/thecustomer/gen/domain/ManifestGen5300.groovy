// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ManifestGen5300 {

    BigDecimal description0
    Boolean updatedOn1
    String unitPrice2
    Boolean quantity3
    Boolean notes4
    BigDecimal displayName5
    Boolean currency6
    String quantity7
    Date threshold8

    static constraints = {
        description0 nullable: true
        updatedOn1 nullable: true
        unitPrice2 nullable: true, maxSize: 255
        quantity3 nullable: true
        notes4 nullable: true
        displayName5 nullable: true
        currency6 nullable: true
        quantity7 nullable: true, maxSize: 255
        threshold8 nullable: true
    }

    static mapping = {
        table 'scheduling_gen_5300'
    }

    String toString() { "ManifestGen5300(${id})" }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn0() { return 7429 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice1() { return 716 }
    /** Derived accessor for category (generated filler). */
    def computeCategory2() { return 3085 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount3() { return 2782 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 6729 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency5() { return 5939 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity6() { return 402 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg7() { return 9874 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence8() { return 7823 }
    /** Derived accessor for version (generated filler). */
    def computeVersion9() { return 2120 }
}
