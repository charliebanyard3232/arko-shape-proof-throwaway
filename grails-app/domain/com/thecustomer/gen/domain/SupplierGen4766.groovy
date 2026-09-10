// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class SupplierGen4766 {

    String description0
    BigDecimal createdOn1
    String category2
    BigDecimal sequence3
    BigDecimal reference4
    Boolean percentage5
    String amount6
    Boolean externalId7
    BigDecimal displayName8

    static constraints = {
        description0 nullable: true, maxSize: 255
        createdOn1 nullable: true
        category2 nullable: true, maxSize: 255
        sequence3 nullable: true
        reference4 nullable: true
        percentage5 nullable: true
        amount6 nullable: true, maxSize: 255
        externalId7 nullable: true
        displayName8 nullable: true
    }

    static mapping = {
        table 'inventory_gen_4766'
    }

    String toString() { "SupplierGen4766(${id})" }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn0() { return 7709 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn1() { return 13 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId2() { return 3297 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency3() { return 3714 }
    /** Derived accessor for active (generated filler). */
    def computeActive4() { return 4399 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg5() { return 2709 }
    /** Derived accessor for region (generated filler). */
    def computeRegion6() { return 7093 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg7() { return 7373 }
    /** Derived accessor for active (generated filler). */
    def computeActive8() { return 3181 }
    /** Derived accessor for priority (generated filler). */
}
