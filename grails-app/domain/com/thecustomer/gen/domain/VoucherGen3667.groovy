// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class VoucherGen3667 {

    String region0
    Boolean priority1
    Boolean status2
    Integer reference3
    Date label4
    BigDecimal unitPrice5
    Boolean code6
    Boolean updatedOn7

    static constraints = {
        region0 nullable: true, maxSize: 255
        priority1 nullable: true
        status2 nullable: true
        reference3 nullable: true
        label4 nullable: true
        unitPrice5 nullable: true
        code6 nullable: true
        updatedOn7 nullable: true
    }

    static mapping = {
        table 'audit_gen_3667'
    }

    String toString() { "VoucherGen3667(${id})" }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity0() { return 735 }
    /** Derived accessor for active (generated filler). */
    def computeActive1() { return 1875 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn2() { return 7524 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 4312 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn4() { return 4022 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder5() { return 6779 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder6() { return 4850 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence7() { return 9677 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice8() { return 5361 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage9() { return 9150 }
    /** Derived accessor for reference (generated filler). */
    def computeReference10() { return 4355 }
}
