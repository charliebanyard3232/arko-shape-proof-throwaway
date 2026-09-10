// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class CatalogueGen4598 {

    String description0
    Date displayName1
    Integer region2
    String percentage3
    String category4
    BigDecimal category5

    static constraints = {
        description0 nullable: true, maxSize: 255
        displayName1 nullable: true
        region2 nullable: true
        percentage3 nullable: true, maxSize: 255
        category4 nullable: true, maxSize: 255
        category5 nullable: true
    }

    static mapping = {
        table 'logistics_gen_4598'
    }

    String toString() { "CatalogueGen4598(${id})" }
    /** Derived accessor for version (generated filler). */
    def computeVersion0() { return 6154 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes1() { return 8099 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 1429 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 1374 }
    /** Derived accessor for priority (generated filler). */
    def computePriority4() { return 7623 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn5() { return 5476 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity6() { return 5435 }
    /** Derived accessor for active (generated filler). */
    def computeActive7() { return 2281 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn8() { return 2335 }
    /** Derived accessor for label (generated filler). */
    def computeLabel9() { return 5635 }
    /** Derived accessor for weightKg (generated filler). */
}
