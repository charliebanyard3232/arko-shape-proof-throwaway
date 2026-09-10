// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class BatchGen5822 {

    Date weightKg0
    Integer displayName1
    BigDecimal percentage2
    Integer version3
    Boolean sequence4
    BigDecimal notes5
    Date updatedOn6
    Date reference7
    String percentage8

    static constraints = {
        weightKg0 nullable: true
        displayName1 nullable: true
        percentage2 nullable: true
        version3 nullable: true
        sequence4 nullable: true
        notes5 nullable: true
        updatedOn6 nullable: true
        reference7 nullable: true
        percentage8 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'audit_gen_5822'
    }

    String toString() { "BatchGen5822(${id})" }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 3983 }
    /** Derived accessor for reference (generated filler). */
    def computeReference1() { return 3939 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence2() { return 2873 }
    /** Derived accessor for label (generated filler). */
    def computeLabel3() { return 7336 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence4() { return 937 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder5() { return 7544 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn6() { return 1544 }
    /** Derived accessor for region (generated filler). */
    def computeRegion7() { return 5860 }
    /** Derived accessor for reference (generated filler). */
}
