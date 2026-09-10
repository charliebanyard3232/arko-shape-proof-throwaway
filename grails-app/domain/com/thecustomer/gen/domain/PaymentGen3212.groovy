// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class PaymentGen3212 {

    Integer threshold0
    BigDecimal weightKg1
    BigDecimal currency2
    String externalId3
    Date currency4
    Boolean sortOrder5
    Integer percentage6
    Date updatedOn7
    Date sequence8

    static constraints = {
        threshold0 nullable: true
        weightKg1 nullable: true
        currency2 nullable: true
        externalId3 nullable: true, maxSize: 255
        currency4 nullable: true
        sortOrder5 nullable: true
        percentage6 nullable: true
        updatedOn7 nullable: true
        sequence8 nullable: true
    }

    static mapping = {
        table 'returns_gen_3212'
    }

    String toString() { "PaymentGen3212(${id})" }
    /** Derived accessor for region (generated filler). */
    def computeRegion0() { return 9512 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName1() { return 4566 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 1777 }
    /** Derived accessor for label (generated filler). */
    def computeLabel3() { return 423 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency4() { return 4947 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 6928 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount6() { return 4364 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes7() { return 3506 }
    /** Derived accessor for priority (generated filler). */
    def computePriority8() { return 4019 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity9() { return 5072 }
    /** Derived accessor for active (generated filler). */
    def computeActive10() { return 637 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount11() { return 2891 }
    /** Derived accessor for region (generated filler). */
    def computeRegion12() { return 6623 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn13() { return 4277 }
    /** Derived accessor for region (generated filler). */
    def computeRegion14() { return 763 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice15() { return 4411 }
}
