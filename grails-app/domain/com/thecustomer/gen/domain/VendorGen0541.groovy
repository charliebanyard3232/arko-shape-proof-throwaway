// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class VendorGen0541 {

    Boolean sequence0
    String category1
    String sequence2
    Boolean description3
    Date externalId4
    BigDecimal code5
    Integer sequence6
    Boolean createdOn7
    Date label8

    static constraints = {
        sequence0 nullable: true
        category1 nullable: true, maxSize: 255
        sequence2 nullable: true, maxSize: 255
        description3 nullable: true
        externalId4 nullable: true
        code5 nullable: true
        sequence6 nullable: true
        createdOn7 nullable: true
        label8 nullable: true
    }

    static mapping = {
        table 'inventory_gen_0541'
    }

    String toString() { "VendorGen0541(${id})" }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence0() { return 9688 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 8607 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg2() { return 64 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName3() { return 921 }
    /** Derived accessor for description (generated filler). */
    def computeDescription4() { return 3694 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn5() { return 1536 }
    /** Derived accessor for region (generated filler). */
    def computeRegion6() { return 9923 }
    /** Derived accessor for version (generated filler). */
    def computeVersion7() { return 1768 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName8() { return 6188 }
    /** Derived accessor for region (generated filler). */
    def computeRegion9() { return 6286 }
}
