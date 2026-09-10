// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class DepotGen4710 {

    Boolean code0
    Integer externalId1
    String version2
    Date percentage3
    Integer reference4
    BigDecimal description5
    Boolean description6
    Integer amount7
    Boolean label8

    static constraints = {
        code0 nullable: true
        externalId1 nullable: true
        version2 nullable: true, maxSize: 255
        percentage3 nullable: true
        reference4 nullable: true
        description5 nullable: true
        description6 nullable: true
        amount7 nullable: true
        label8 nullable: true
    }

    static mapping = {
        table 'reference_gen_4710'
    }

    String toString() { "DepotGen4710(${id})" }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 3784 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity1() { return 5367 }
    /** Derived accessor for category (generated filler). */
    def computeCategory2() { return 39 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 509 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency4() { return 6476 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 7315 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes6() { return 8103 }
    /** Derived accessor for sortOrder (generated filler). */
}
