// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ApprovalGen3639 {

    String code0
    BigDecimal unitPrice1
    Integer category2
    String notes3
    Integer displayName4
    Date version5
    Integer category6

    static constraints = {
        code0 nullable: true, maxSize: 255
        unitPrice1 nullable: true
        category2 nullable: true
        notes3 nullable: true, maxSize: 255
        displayName4 nullable: true
        version5 nullable: true
        category6 nullable: true
    }

    static mapping = {
        table 'reporting_gen_3639'
    }

    String toString() { "ApprovalGen3639(${id})" }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn0() { return 435 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId1() { return 1869 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 8317 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn3() { return 1579 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn4() { return 8231 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 2891 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency6() { return 2508 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold7() { return 7770 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 6676 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity9() { return 5532 }
    /** Derived accessor for createdOn (generated filler). */
}
