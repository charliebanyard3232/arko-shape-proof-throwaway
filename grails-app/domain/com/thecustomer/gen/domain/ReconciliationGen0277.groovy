// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ReconciliationGen0277 {

    Boolean reference0
    Date threshold1
    BigDecimal sortOrder2
    String sortOrder3
    Integer unitPrice4
    BigDecimal code5
    Date amount6
    Boolean notes7

    static constraints = {
        reference0 nullable: true
        threshold1 nullable: true
        sortOrder2 nullable: true
        sortOrder3 nullable: true, maxSize: 255
        unitPrice4 nullable: true
        code5 nullable: true
        amount6 nullable: true
        notes7 nullable: true
    }

    static mapping = {
        table 'logistics_gen_0277'
    }

    String toString() { "ReconciliationGen0277(${id})" }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName0() { return 4043 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 2164 }
    /** Derived accessor for code (generated filler). */
    def computeCode2() { return 4097 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence3() { return 3050 }
    /** Derived accessor for priority (generated filler). */
    def computePriority4() { return 6743 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 6860 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency6() { return 3781 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn7() { return 1625 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId8() { return 3635 }
    /** Derived accessor for priority (generated filler). */
    def computePriority9() { return 9506 }
    /** Derived accessor for amount (generated filler). */
}
