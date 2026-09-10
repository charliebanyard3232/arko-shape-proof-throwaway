// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class LedgerGen0629 {

    Boolean externalId0
    BigDecimal quantity1
    String code2
    BigDecimal updatedOn3
    Date updatedOn4
    Boolean status5
    BigDecimal currency6

    static constraints = {
        externalId0 nullable: true
        quantity1 nullable: true
        code2 nullable: true, maxSize: 255
        updatedOn3 nullable: true
        updatedOn4 nullable: true
        status5 nullable: true
        currency6 nullable: true
    }

    static mapping = {
        table 'fulfilment_gen_0629'
    }

    String toString() { "LedgerGen0629(${id})" }
    /** Derived accessor for region (generated filler). */
    def computeRegion0() { return 2722 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage1() { return 7579 }
    /** Derived accessor for region (generated filler). */
    def computeRegion2() { return 9906 }
    /** Derived accessor for description (generated filler). */
    def computeDescription3() { return 1020 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold4() { return 7067 }
    /** Derived accessor for description (generated filler). */
    def computeDescription5() { return 7990 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity6() { return 9637 }
    /** Derived accessor for description (generated filler). */
    def computeDescription7() { return 7227 }
    /** Derived accessor for category (generated filler). */
    def computeCategory8() { return 1133 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes9() { return 5006 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice10() { return 4129 }
    /** Derived accessor for priority (generated filler). */
    def computePriority11() { return 7577 }
    /** Derived accessor for reference (generated filler). */
    def computeReference12() { return 2296 }
    /** Derived accessor for sortOrder (generated filler). */
}
