// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ReconciliationGen3730 {

    Date externalId0
    Boolean threshold1
    Boolean currency2
    Integer threshold3
    String active4
    Date code5
    Date version6
    BigDecimal threshold7

    static constraints = {
        externalId0 nullable: true
        threshold1 nullable: true
        currency2 nullable: true
        threshold3 nullable: true
        active4 nullable: true, maxSize: 255
        code5 nullable: true
        version6 nullable: true
        threshold7 nullable: true
    }

    static mapping = {
        table 'reporting_gen_3730'
    }

    String toString() { "ReconciliationGen3730(${id})" }
    /** Derived accessor for active (generated filler). */
    def computeActive0() { return 6057 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId1() { return 6142 }
    /** Derived accessor for priority (generated filler). */
    def computePriority2() { return 4811 }
    /** Derived accessor for status (generated filler). */
    def computeStatus3() { return 5215 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder4() { return 3721 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes5() { return 6868 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId6() { return 2838 }
    /** Derived accessor for region (generated filler). */
    def computeRegion7() { return 7458 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage8() { return 57 }
    /** Derived accessor for description (generated filler). */
    def computeDescription9() { return 91 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn10() { return 7773 }
    /** Derived accessor for category (generated filler). */
    def computeCategory11() { return 9172 }
    /** Derived accessor for reference (generated filler). */
    def computeReference12() { return 9831 }
    /** Derived accessor for label (generated filler). */
    def computeLabel13() { return 2476 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage14() { return 7105 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity15() { return 1933 }
    /** Derived accessor for version (generated filler). */
    def computeVersion16() { return 3775 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity17() { return 2384 }
    /** Derived accessor for priority (generated filler). */
    def computePriority18() { return 7005 }
}
