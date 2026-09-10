// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class AdjustmentGen3800 {

    Date createdOn0
    Boolean region1
    Integer label2
    Boolean sortOrder3
    String updatedOn4
    Date description5
    Boolean sortOrder6
    String description7

    static constraints = {
        createdOn0 nullable: true
        region1 nullable: true
        label2 nullable: true
        sortOrder3 nullable: true
        updatedOn4 nullable: true, maxSize: 255
        description5 nullable: true
        sortOrder6 nullable: true
        description7 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'reporting_gen_3800'
    }

    String toString() { "AdjustmentGen3800(${id})" }
    /** Derived accessor for description (generated filler). */
    def computeDescription0() { return 3133 }
    /** Derived accessor for priority (generated filler). */
    def computePriority1() { return 8717 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount2() { return 435 }
    /** Derived accessor for active (generated filler). */
    def computeActive3() { return 9166 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency4() { return 4969 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice5() { return 9064 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 1551 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName7() { return 4703 }
    /** Derived accessor for code (generated filler). */
}
