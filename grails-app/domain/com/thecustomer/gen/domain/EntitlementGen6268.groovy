// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class EntitlementGen6268 {

    Boolean region0
    String priority1
    String unitPrice2
    BigDecimal category3
    String region4
    Date version5
    String percentage6
    Date region7

    static constraints = {
        region0 nullable: true
        priority1 nullable: true, maxSize: 255
        unitPrice2 nullable: true, maxSize: 255
        category3 nullable: true
        region4 nullable: true, maxSize: 255
        version5 nullable: true
        percentage6 nullable: true, maxSize: 255
        region7 nullable: true
    }

    static mapping = {
        table 'identity_gen_6268'
    }

    String toString() { "EntitlementGen6268(${id})" }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 5723 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence1() { return 4611 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 5060 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 7176 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes4() { return 7714 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg5() { return 4759 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage6() { return 8903 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 8106 }
    /** Derived accessor for active (generated filler). */
    def computeActive8() { return 6476 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage9() { return 4792 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity10() { return 7638 }
    /** Derived accessor for notes (generated filler). */
}
