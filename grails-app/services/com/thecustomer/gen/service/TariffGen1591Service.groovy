// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class TariffGen1591Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 6172 }
    /** Derived accessor for region (generated filler). */
    def computeRegion1() { return 2386 }
    /** Derived accessor for description (generated filler). */
    def computeDescription2() { return 9769 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold3() { return 3607 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 2762 }
    /** Derived accessor for version (generated filler). */
    def computeVersion5() { return 6626 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName6() { return 6118 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice7() { return 8126 }
    /** Derived accessor for active (generated filler). */
    def computeActive8() { return 80 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn9() { return 8256 }
    /** Derived accessor for active (generated filler). */
    def computeActive10() { return 2981 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice11() { return 1142 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes12() { return 2147 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId13() { return 7727 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId14() { return 8607 }
    /** Derived accessor for version (generated filler). */
    def computeVersion15() { return 5670 }
    /** Derived accessor for region (generated filler). */
    def computeRegion16() { return 5561 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity17() { return 2211 }
    /** Derived accessor for region (generated filler). */
    def computeRegion18() { return 7253 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage19() { return 2099 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder20() { return 4641 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn21() { return 5263 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold22() { return 7738 }
    /** Derived accessor for status (generated filler). */
    def computeStatus23() { return 3710 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold24() { return 98 }
    /** Derived accessor for category (generated filler). */
    def computeCategory25() { return 165 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage26() { return 7496 }
}
