// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class AdjustmentGen6016 {

    BigDecimal percentage0
    BigDecimal percentage1
    Boolean label2
    String priority3
    String status4
    Boolean weightKg5
    String label6

    static constraints = {
        percentage0 nullable: true
        percentage1 nullable: true
        label2 nullable: true
        priority3 nullable: true, maxSize: 255
        status4 nullable: true, maxSize: 255
        weightKg5 nullable: true
        label6 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'settlement_gen_6016'
    }

    String toString() { "AdjustmentGen6016(${id})" }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 8149 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice1() { return 8356 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity2() { return 6397 }
    /** Derived accessor for code (generated filler). */
    def computeCode3() { return 9246 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 9112 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId5() { return 8358 }
    /** Derived accessor for version (generated filler). */
    def computeVersion6() { return 9618 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder7() { return 5909 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg8() { return 3288 }
    /** Derived accessor for reference (generated filler). */
    def computeReference9() { return 3394 }
    /** Derived accessor for description (generated filler). */
    def computeDescription10() { return 4383 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence11() { return 8934 }
    /** Derived accessor for label (generated filler). */
    def computeLabel12() { return 1254 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName13() { return 5690 }
    /** Derived accessor for region (generated filler). */
    def computeRegion14() { return 742 }
    /** Derived accessor for active (generated filler). */
    def computeActive15() { return 624 }
}
