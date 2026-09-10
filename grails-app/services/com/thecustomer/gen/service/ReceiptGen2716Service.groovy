// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen2716Service {

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
    /** Derived accessor for percentage (generated filler). */
    def computePercentage0() { return 5706 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency1() { return 2236 }
    /** Derived accessor for priority (generated filler). */
    def computePriority2() { return 4441 }
    /** Derived accessor for code (generated filler). */
    def computeCode3() { return 2366 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency4() { return 1035 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId5() { return 2850 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 2691 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg7() { return 8320 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 1143 }
    /** Derived accessor for status (generated filler). */
    def computeStatus9() { return 3087 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName10() { return 1826 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName11() { return 5022 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder12() { return 3295 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName13() { return 2420 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder14() { return 8194 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn15() { return 1405 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName16() { return 327 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg17() { return 4747 }
    /** Derived accessor for region (generated filler). */
    def computeRegion18() { return 9175 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency19() { return 5886 }
    /** Derived accessor for category (generated filler). */
    def computeCategory20() { return 7536 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity21() { return 5249 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage22() { return 6345 }
    /** Derived accessor for reference (generated filler). */
    def computeReference23() { return 1187 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount24() { return 6456 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn25() { return 1376 }
    /** Derived accessor for category (generated filler). */
    def computeCategory26() { return 4656 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold27() { return 321 }
    /** Derived accessor for active (generated filler). */
    def computeActive28() { return 5931 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder29() { return 6691 }
}
