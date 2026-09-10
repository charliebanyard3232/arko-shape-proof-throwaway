// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class WorkflowGen2638 {

    Date code0
    String category1
    String description2
    Date status3
    Boolean currency4
    Integer region5
    Boolean externalId6
    Date status7
    String amount8

    static constraints = {
        code0 nullable: true
        category1 nullable: true, maxSize: 255
        description2 nullable: true, maxSize: 255
        status3 nullable: true
        currency4 nullable: true
        region5 nullable: true
        externalId6 nullable: true
        status7 nullable: true
        amount8 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'pricing_gen_2638'
    }

    String toString() { "WorkflowGen2638(${id})" }
    /** Derived accessor for active (generated filler). */
    def computeActive0() { return 9413 }
    /** Derived accessor for category (generated filler). */
    def computeCategory1() { return 4439 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 8251 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 4527 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn4() { return 2126 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg5() { return 2551 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity6() { return 7975 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn7() { return 2800 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder8() { return 8201 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes9() { return 5142 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage10() { return 6997 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn11() { return 2509 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes12() { return 1309 }
    /** Derived accessor for currency (generated filler). */
}
