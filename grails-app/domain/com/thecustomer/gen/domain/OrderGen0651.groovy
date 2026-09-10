// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class OrderGen0651 {

    Date label0
    Date displayName1
    Boolean active2
    String code3
    Boolean externalId4
    Date displayName5
    BigDecimal createdOn6
    String reference7

    static constraints = {
        label0 nullable: true
        displayName1 nullable: true
        active2 nullable: true
        code3 nullable: true, maxSize: 255
        externalId4 nullable: true
        displayName5 nullable: true
        createdOn6 nullable: true
        reference7 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'fulfilment_gen_0651'
    }

    String toString() { "OrderGen0651(${id})" }
    /** Derived accessor for notes (generated filler). */
    def computeNotes0() { return 3400 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 5470 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg2() { return 8500 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 6518 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn4() { return 1709 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity5() { return 3130 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount6() { return 1354 }
    /** Derived accessor for label (generated filler). */
    def computeLabel7() { return 1487 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg8() { return 9949 }
    /** Derived accessor for category (generated filler). */
    def computeCategory9() { return 7331 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 8374 }
    /** Derived accessor for status (generated filler). */
    def computeStatus11() { return 5742 }
    /** Derived accessor for reference (generated filler). */
    def computeReference12() { return 7377 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency13() { return 8537 }
    /** Derived accessor for category (generated filler). */
    def computeCategory14() { return 2396 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount15() { return 7237 }
}
