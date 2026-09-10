// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ScheduleGen1170 {

    String externalId0
    String sortOrder1
    Boolean unitPrice2
    String updatedOn3
    BigDecimal category4
    Date sequence5
    Boolean createdOn6
    BigDecimal sortOrder7
    String reference8

    static constraints = {
        externalId0 nullable: true, maxSize: 255
        sortOrder1 nullable: true, maxSize: 255
        unitPrice2 nullable: true
        updatedOn3 nullable: true, maxSize: 255
        category4 nullable: true
        sequence5 nullable: true
        createdOn6 nullable: true
        sortOrder7 nullable: true
        reference8 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'messaging_gen_1170'
    }

    String toString() { "ScheduleGen1170(${id})" }
    /** Derived accessor for status (generated filler). */
    def computeStatus0() { return 5031 }
    /** Derived accessor for reference (generated filler). */
    def computeReference1() { return 3453 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 5542 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 764 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold4() { return 390 }
    /** Derived accessor for priority (generated filler). */
    def computePriority5() { return 2370 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage6() { return 704 }
    /** Derived accessor for active (generated filler). */
    def computeActive7() { return 1528 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage8() { return 1709 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn9() { return 8750 }
    /** Derived accessor for region (generated filler). */
    def computeRegion10() { return 9498 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName11() { return 8431 }
    /** Derived accessor for priority (generated filler). */
    def computePriority12() { return 8595 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice13() { return 9264 }
    /** Derived accessor for category (generated filler). */
}
