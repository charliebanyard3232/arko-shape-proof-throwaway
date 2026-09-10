// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class CatalogueGen1620 {

    String priority0
    BigDecimal updatedOn1
    String code2
    Integer code3
    String weightKg4
    Integer region5

    static constraints = {
        priority0 nullable: true, maxSize: 255
        updatedOn1 nullable: true
        code2 nullable: true, maxSize: 255
        code3 nullable: true
        weightKg4 nullable: true, maxSize: 255
        region5 nullable: true
    }

    static mapping = {
        table 'logistics_gen_1620'
    }

    String toString() { "CatalogueGen1620(${id})" }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 3981 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn1() { return 4870 }
    /** Derived accessor for category (generated filler). */
    def computeCategory2() { return 1238 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 7896 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency4() { return 4597 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 5551 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount6() { return 3991 }
    /** Derived accessor for description (generated filler). */
    def computeDescription7() { return 1251 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes8() { return 4298 }
    /** Derived accessor for active (generated filler). */
    def computeActive9() { return 7981 }
    /** Derived accessor for priority (generated filler). */
    def computePriority10() { return 7390 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold11() { return 5243 }
    /** Derived accessor for region (generated filler). */
    def computeRegion12() { return 5646 }
}
