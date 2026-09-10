// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class PaymentGen5414 {

    Integer threshold0
    BigDecimal active1
    BigDecimal region2
    Date version3
    String priority4
    Boolean displayName5
    String externalId6
    BigDecimal description7
    BigDecimal createdOn8

    static constraints = {
        threshold0 nullable: true
        active1 nullable: true
        region2 nullable: true
        version3 nullable: true
        priority4 nullable: true, maxSize: 255
        displayName5 nullable: true
        externalId6 nullable: true, maxSize: 255
        description7 nullable: true
        createdOn8 nullable: true
    }

    static mapping = {
        table 'pricing_gen_5414'
    }

    String toString() { "PaymentGen5414(${id})" }
    /** Derived accessor for active (generated filler). */
    def computeActive0() { return 6249 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId1() { return 2290 }
    /** Derived accessor for label (generated filler). */
    def computeLabel2() { return 9210 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity3() { return 9040 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 1678 }
    /** Derived accessor for reference (generated filler). */
    def computeReference5() { return 1968 }
    /** Derived accessor for category (generated filler). */
    def computeCategory6() { return 1528 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 4643 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName8() { return 5762 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes9() { return 4094 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName10() { return 6148 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg11() { return 2359 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes12() { return 7981 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes13() { return 644 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName14() { return 3612 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity15() { return 8485 }
    /** Derived accessor for version (generated filler). */
    def computeVersion16() { return 5222 }
    /** Derived accessor for active (generated filler). */
    def computeActive17() { return 3403 }
    /** Derived accessor for priority (generated filler). */
    def computePriority18() { return 542 }
}
