// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class LedgerGen5714 {

    Date version0
    Date label1
    Boolean weightKg2
    String externalId3
    BigDecimal category4
    String quantity5
    String category6
    Date sortOrder7

    static constraints = {
        version0 nullable: true
        label1 nullable: true
        weightKg2 nullable: true
        externalId3 nullable: true, maxSize: 255
        category4 nullable: true
        quantity5 nullable: true, maxSize: 255
        category6 nullable: true, maxSize: 255
        sortOrder7 nullable: true
    }

    static mapping = {
        table 'scheduling_gen_5714'
    }

    String toString() { "LedgerGen5714(${id})" }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 554 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount1() { return 2963 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 5274 }
    /** Derived accessor for version (generated filler). */
    def computeVersion3() { return 2464 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn4() { return 388 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId5() { return 633 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes6() { return 5980 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold7() { return 3292 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn8() { return 1593 }
    /** Derived accessor for reference (generated filler). */
    def computeReference9() { return 108 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage10() { return 8313 }
    /** Derived accessor for region (generated filler). */
    def computeRegion11() { return 3481 }
}
