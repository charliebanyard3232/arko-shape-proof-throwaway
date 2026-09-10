// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ReconciliationGen5102 {

    BigDecimal updatedOn0
    Date displayName1
    String weightKg2
    BigDecimal unitPrice3
    Integer region4
    Integer threshold5

    static constraints = {
        updatedOn0 nullable: true
        displayName1 nullable: true
        weightKg2 nullable: true, maxSize: 255
        unitPrice3 nullable: true
        region4 nullable: true
        threshold5 nullable: true
    }

    static mapping = {
        table 'settlement_gen_5102'
    }

    String toString() { "ReconciliationGen5102(${id})" }
    /** Derived accessor for status (generated filler). */
    def computeStatus0() { return 6025 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 2987 }
    /** Derived accessor for category (generated filler). */
    def computeCategory2() { return 8864 }
    /** Derived accessor for active (generated filler). */
    def computeActive3() { return 2926 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount4() { return 9642 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 7172 }
    /** Derived accessor for version (generated filler). */
    def computeVersion6() { return 5469 }
    /** Derived accessor for reference (generated filler). */
    def computeReference7() { return 3826 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage8() { return 1588 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes9() { return 2839 }
    /** Derived accessor for priority (generated filler). */
    def computePriority10() { return 2907 }
    /** Derived accessor for description (generated filler). */
    def computeDescription11() { return 2641 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder12() { return 6363 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount13() { return 9127 }
    /** Derived accessor for code (generated filler). */
    def computeCode14() { return 1766 }
    /** Derived accessor for label (generated filler). */
    def computeLabel15() { return 8383 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId16() { return 7306 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes17() { return 5983 }
}
