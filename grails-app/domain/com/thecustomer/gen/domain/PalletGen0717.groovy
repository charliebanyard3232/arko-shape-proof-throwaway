// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class PalletGen0717 {

    BigDecimal notes0
    Integer weightKg1
    String label2
    Integer reference3
    Date percentage4
    Integer sequence5
    Boolean externalId6
    String label7

    static constraints = {
        notes0 nullable: true
        weightKg1 nullable: true
        label2 nullable: true, maxSize: 255
        reference3 nullable: true
        percentage4 nullable: true
        sequence5 nullable: true
        externalId6 nullable: true
        label7 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'scheduling_gen_0717'
    }

    String toString() { "PalletGen0717(${id})" }
    /** Derived accessor for status (generated filler). */
    def computeStatus0() { return 5145 }
    /** Derived accessor for priority (generated filler). */
    def computePriority1() { return 3368 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity2() { return 9068 }
    /** Derived accessor for description (generated filler). */
    def computeDescription3() { return 161 }
    /** Derived accessor for version (generated filler). */
    def computeVersion4() { return 3149 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage5() { return 9530 }
    /** Derived accessor for version (generated filler). */
    def computeVersion6() { return 9361 }
    /** Derived accessor for reference (generated filler). */
    def computeReference7() { return 6381 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 8945 }
    /** Derived accessor for priority (generated filler). */
    def computePriority9() { return 6849 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 3465 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId11() { return 65 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage12() { return 7257 }
    /** Derived accessor for priority (generated filler). */
    def computePriority13() { return 7467 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn14() { return 39 }
}
