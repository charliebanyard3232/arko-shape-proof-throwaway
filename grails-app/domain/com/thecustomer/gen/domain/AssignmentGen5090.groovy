// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class AssignmentGen5090 {

    Integer notes0
    Boolean region1
    Integer region2
    String description3
    String description4
    Boolean updatedOn5
    Boolean sequence6

    static constraints = {
        notes0 nullable: true
        region1 nullable: true
        region2 nullable: true
        description3 nullable: true, maxSize: 255
        description4 nullable: true, maxSize: 255
        updatedOn5 nullable: true
        sequence6 nullable: true
    }

    static mapping = {
        table 'reporting_gen_5090'
    }

    String toString() { "AssignmentGen5090(${id})" }
    /** Derived accessor for amount (generated filler). */
    def computeAmount0() { return 8553 }
    /** Derived accessor for active (generated filler). */
    def computeActive1() { return 1863 }
    /** Derived accessor for reference (generated filler). */
    def computeReference2() { return 7659 }
    /** Derived accessor for version (generated filler). */
    def computeVersion3() { return 1206 }
    /** Derived accessor for priority (generated filler). */
    def computePriority4() { return 297 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 6496 }
    /** Derived accessor for reference (generated filler). */
    def computeReference6() { return 202 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity7() { return 5178 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn8() { return 2182 }
    /** Derived accessor for displayName (generated filler). */
}
