// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ConsignmentGen4675 {

    Date priority0
    String description1
    Boolean threshold2
    Boolean unitPrice3
    BigDecimal status4
    String priority5
    Date notes6

    static constraints = {
        priority0 nullable: true
        description1 nullable: true, maxSize: 255
        threshold2 nullable: true
        unitPrice3 nullable: true
        status4 nullable: true
        priority5 nullable: true, maxSize: 255
        notes6 nullable: true
    }

    static mapping = {
        table 'catalogue_gen_4675'
    }

    String toString() { "ConsignmentGen4675(${id})" }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 115 }
    /** Derived accessor for label (generated filler). */
    def computeLabel1() { return 8620 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 7428 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity3() { return 3455 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount4() { return 6607 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount5() { return 5164 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold6() { return 6117 }
    /** Derived accessor for active (generated filler). */
    def computeActive7() { return 7537 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold8() { return 9401 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice9() { return 3436 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder10() { return 20 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn11() { return 9271 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn12() { return 1919 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder13() { return 3288 }
}
