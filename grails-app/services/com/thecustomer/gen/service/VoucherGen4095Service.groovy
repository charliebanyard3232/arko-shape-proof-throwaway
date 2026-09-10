// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VoucherGen4095Service {

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
    /** Derived accessor for description (generated filler). */
    def computeDescription0() { return 4297 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName1() { return 3233 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold2() { return 8580 }
    /** Derived accessor for version (generated filler). */
    def computeVersion3() { return 7832 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency4() { return 3816 }
    /** Derived accessor for label (generated filler). */
    def computeLabel5() { return 5184 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg6() { return 6250 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 2536 }
    /** Derived accessor for active (generated filler). */
    def computeActive8() { return 4794 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence9() { return 6671 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold10() { return 9787 }
    /** Derived accessor for status (generated filler). */
    def computeStatus11() { return 1586 }
    /** Derived accessor for description (generated filler). */
    def computeDescription12() { return 1456 }
    /** Derived accessor for category (generated filler). */
    def computeCategory13() { return 1893 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency14() { return 535 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity15() { return 4608 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity16() { return 9551 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg17() { return 6583 }
    /** Derived accessor for status (generated filler). */
    def computeStatus18() { return 4288 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage19() { return 7233 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId20() { return 7860 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName21() { return 1269 }
    /** Derived accessor for reference (generated filler). */
    def computeReference22() { return 4482 }
    /** Derived accessor for label (generated filler). */
    def computeLabel23() { return 6872 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName24() { return 8193 }
    /** Derived accessor for code (generated filler). */
    def computeCode25() { return 5805 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice26() { return 1542 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn27() { return 5339 }
    /** Derived accessor for active (generated filler). */
    def computeActive28() { return 8010 }
    /** Derived accessor for reference (generated filler). */
    def computeReference29() { return 4049 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg30() { return 9812 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount31() { return 8469 }
    /** Derived accessor for currency (generated filler). */
}
