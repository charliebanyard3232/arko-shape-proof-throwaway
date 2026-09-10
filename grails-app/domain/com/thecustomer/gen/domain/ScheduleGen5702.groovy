// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ScheduleGen5702 {

    Date version0
    Date quantity1
    BigDecimal createdOn2
    Boolean notes3
    Integer sequence4
    String region5
    String priority6
    Date code7

    static constraints = {
        version0 nullable: true
        quantity1 nullable: true
        createdOn2 nullable: true
        notes3 nullable: true
        sequence4 nullable: true
        region5 nullable: true, maxSize: 255
        priority6 nullable: true, maxSize: 255
        code7 nullable: true
    }

    static mapping = {
        table 'pricing_gen_5702'
    }

    String toString() { "ScheduleGen5702(${id})" }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 3606 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity1() { return 4741 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn2() { return 5012 }
    /** Derived accessor for version (generated filler). */
    def computeVersion3() { return 735 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder4() { return 7389 }
    /** Derived accessor for region (generated filler). */
    def computeRegion5() { return 213 }
    /** Derived accessor for priority (generated filler). */
    def computePriority6() { return 7506 }
    /** Derived accessor for reference (generated filler). */
    def computeReference7() { return 1506 }
    /** Derived accessor for version (generated filler). */
    def computeVersion8() { return 2904 }
}
