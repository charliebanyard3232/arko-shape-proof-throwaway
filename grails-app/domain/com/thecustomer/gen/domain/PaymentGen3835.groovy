// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class PaymentGen3835 {

    Date threshold0
    Boolean code1
    String region2
    Date updatedOn3
    Date region4
    Integer version5
    Boolean externalId6
    String unitPrice7

    static constraints = {
        threshold0 nullable: true
        code1 nullable: true
        region2 nullable: true, maxSize: 255
        updatedOn3 nullable: true
        region4 nullable: true
        version5 nullable: true
        externalId6 nullable: true
        unitPrice7 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'audit_gen_3835'
    }

    String toString() { "PaymentGen3835(${id})" }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence0() { return 4213 }
    /** Derived accessor for status (generated filler). */
    def computeStatus1() { return 195 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence2() { return 3883 }
    /** Derived accessor for version (generated filler). */
    def computeVersion3() { return 473 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder4() { return 3224 }
    /** Derived accessor for region (generated filler). */
    def computeRegion5() { return 7607 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency6() { return 6081 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn7() { return 6618 }
    /** Derived accessor for code (generated filler). */
    def computeCode8() { return 9765 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity9() { return 3055 }
    /** Derived accessor for description (generated filler). */
    def computeDescription10() { return 1876 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency11() { return 3759 }
    /** Derived accessor for label (generated filler). */
    def computeLabel12() { return 5379 }
    /** Derived accessor for region (generated filler). */
    def computeRegion13() { return 2149 }
    /** Derived accessor for label (generated filler). */
    def computeLabel14() { return 3541 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn15() { return 9278 }
}
