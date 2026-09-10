// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class AdjustmentGen1954 {

    Boolean priority0
    BigDecimal unitPrice1
    BigDecimal code2
    Date currency3
    String category4
    Integer amount5
    BigDecimal unitPrice6

    static constraints = {
        priority0 nullable: true
        unitPrice1 nullable: true
        code2 nullable: true
        currency3 nullable: true
        category4 nullable: true, maxSize: 255
        amount5 nullable: true
        unitPrice6 nullable: true
    }

    static mapping = {
        table 'catalogue_gen_1954'
    }

    String toString() { "AdjustmentGen1954(${id})" }
    /** Derived accessor for amount (generated filler). */
    def computeAmount0() { return 8913 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage1() { return 7640 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold2() { return 5676 }
    /** Derived accessor for active (generated filler). */
    def computeActive3() { return 5219 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 8111 }
    /** Derived accessor for label (generated filler). */
    def computeLabel5() { return 9969 }
    /** Derived accessor for version (generated filler). */
    def computeVersion6() { return 797 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes7() { return 5719 }
    /** Derived accessor for priority (generated filler). */
    def computePriority8() { return 5452 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder9() { return 700 }
    /** Derived accessor for category (generated filler). */
}
