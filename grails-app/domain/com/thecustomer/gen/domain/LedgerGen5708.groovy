// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class LedgerGen5708 {

    String percentage0
    BigDecimal weightKg1
    BigDecimal description2
    Boolean code3
    Date threshold4
    Date externalId5
    Integer priority6
    Date notes7

    static constraints = {
        percentage0 nullable: true, maxSize: 255
        weightKg1 nullable: true
        description2 nullable: true
        code3 nullable: true
        threshold4 nullable: true
        externalId5 nullable: true
        priority6 nullable: true
        notes7 nullable: true
    }

    static mapping = {
        table 'logistics_gen_5708'
    }

    String toString() { "LedgerGen5708(${id})" }
    /** Derived accessor for version (generated filler). */
    def computeVersion0() { return 635 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn1() { return 7060 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence2() { return 3900 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount3() { return 8081 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 6192 }
    /** Derived accessor for version (generated filler). */
    def computeVersion5() { return 9097 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 8047 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice7() { return 416 }
    /** Derived accessor for status (generated filler). */
    def computeStatus8() { return 7817 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg9() { return 3398 }
    /** Derived accessor for reference (generated filler). */
    def computeReference10() { return 247 }
    /** Derived accessor for code (generated filler). */
}
