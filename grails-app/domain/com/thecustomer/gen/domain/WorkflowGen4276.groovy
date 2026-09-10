// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class WorkflowGen4276 {

    Integer description0
    String region1
    String reference2
    String unitPrice3
    String category4
    Date sortOrder5

    static constraints = {
        description0 nullable: true
        region1 nullable: true, maxSize: 255
        reference2 nullable: true, maxSize: 255
        unitPrice3 nullable: true, maxSize: 255
        category4 nullable: true, maxSize: 255
        sortOrder5 nullable: true
    }

    static mapping = {
        table 'identity_gen_4276'
    }

    String toString() { "WorkflowGen4276(${id})" }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn0() { return 1325 }
    /** Derived accessor for category (generated filler). */
    def computeCategory1() { return 5355 }
    /** Derived accessor for region (generated filler). */
    def computeRegion2() { return 9523 }
    /** Derived accessor for active (generated filler). */
    def computeActive3() { return 159 }
    /** Derived accessor for priority (generated filler). */
    def computePriority4() { return 8860 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity5() { return 5331 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 6901 }
    /** Derived accessor for category (generated filler). */
    def computeCategory7() { return 9575 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 3034 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount9() { return 6461 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg10() { return 3939 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold11() { return 7347 }
    /** Derived accessor for status (generated filler). */
    def computeStatus12() { return 7832 }
    /** Derived accessor for reference (generated filler). */
    def computeReference13() { return 2935 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice14() { return 6972 }
}
