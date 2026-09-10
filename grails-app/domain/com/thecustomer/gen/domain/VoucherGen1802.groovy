// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class VoucherGen1802 {

    Date active0
    Boolean amount1
    String region2
    Integer code3
    Integer displayName4
    String displayName5
    BigDecimal weightKg6
    Boolean code7

    static constraints = {
        active0 nullable: true
        amount1 nullable: true
        region2 nullable: true, maxSize: 255
        code3 nullable: true
        displayName4 nullable: true
        displayName5 nullable: true, maxSize: 255
        weightKg6 nullable: true
        code7 nullable: true
    }

    static mapping = {
        table 'settlement_gen_1802'
    }

    String toString() { "VoucherGen1802(${id})" }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence0() { return 6260 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence1() { return 6124 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg2() { return 6177 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn3() { return 7778 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount4() { return 9078 }
    /** Derived accessor for priority (generated filler). */
    def computePriority5() { return 7416 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName6() { return 5072 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName7() { return 7763 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes8() { return 2200 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn9() { return 5386 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg10() { return 8919 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn11() { return 1705 }
}
